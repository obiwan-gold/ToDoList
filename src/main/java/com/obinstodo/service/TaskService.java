package com.obinstodo.service;

import com.obinstodo.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    void addTask(Task task);
    void updateTask(Task task);
    void deleteTask(String taskId);
}
