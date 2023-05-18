package com.obinstodo.todolist.service;

import com.obinstodo.todolist.model.Task;
import com.obinstodo.todolist.repository.TaskRepository;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DefaultTaskService implements TaskService {
  
    private final TaskRepository taskRepository;

    public DefaultTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public int getTaskMapSize(){
        return taskRepository.getTaskMapSize();
    }
    private int generateTaskId() {
        return getTaskMapSize() + 1;
    }

    @Override
    public Map<Integer, Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    @Override
    public Task getTaskById(int taskId) {
        // Task not found, return null
        return taskRepository.getTaskById(taskId);
    }

    @Override
    public boolean createTask(Task newTask) {
        // Generate a unique task ID
        int taskId = generateTaskId();

        Task taskToCreate =
            Task.builder()
                .taskId(taskId)
                .title(newTask.getTitle())
                .description(newTask.getDescription())
                .dueDate(newTask.getDueDate())
                .completed(newTask.isCompleted())
                .build();

        taskRepository.createTask(taskToCreate);
        return taskRepository.checkTaskExistsById(taskToCreate.getTaskId());
    }

    @Override
    public boolean updateTaskById(int taskId, Task updatedTask) {
        // Check task exists before doing anything
        if (!taskRepository.checkTaskExistsById(taskId)) {
            return false;
        }
        // Passes, grab task that exists
        Task existingTask = getTaskById(taskId);
        // Update the fields only if they are not null in the updatedTask object
        if (updatedTask.getTitle() != null) {
            existingTask.setTitle(updatedTask.getTitle());
        }
        if (updatedTask.getDescription() != null) {
            existingTask.setDescription(updatedTask.getDescription());
        }
        if (updatedTask.getDueDate() != null) {
            existingTask.setDueDate(updatedTask.getDueDate());
        }
        // isCompleted is a boolean value, therefore comparison for null doesn't exist
        if (updatedTask.isCompleted() != existingTask.isCompleted()) {
            existingTask.setCompleted(updatedTask.isCompleted());
        }
        taskRepository.updateTask(existingTask);
        return true;
    }

    @Override
    public boolean deleteTaskById(int taskId) {
        Task task = taskRepository.getTaskById(taskId);
        if (task != null) {
            taskRepository.deleteTaskById(taskId);
            return true;
        } else {
            return false;
        }
    }
}
