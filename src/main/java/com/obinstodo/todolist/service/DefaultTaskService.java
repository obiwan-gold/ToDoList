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

    @Override
    public Map<Integer, Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    @Override
    public Task getTaskById(int taskId) {
        return taskRepository.getTaskById(taskId);
    }

    @Override
    public void addTask(Task task) {
      taskRepository.addTask(task);
    }

    @Override
    public void updateTask(Task task) {
        taskRepository.updateTask(task);
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
