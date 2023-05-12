package com.obinstodo.todolist.service;

import com.obinstodo.todolist.model.Task;
import com.obinstodo.todolist.repository.TaskRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultTaskService implements TaskService {
  
    private final TaskRepository taskRepository;

    public DefaultTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
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
    public void deleteTask(String taskId) {
        taskRepository.deleteTask(taskId);
    }
}
