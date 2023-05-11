package com.obinstodo.repository;

import com.obinstodo.model.Task;

import java.util.List;

public interface TaskRepository {
    void addTask(String task);
    void updateTask(String task);
    void deleteTask(String task);
    List<Task> getAllTasks();
}
