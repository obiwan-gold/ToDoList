package com.obinstodo.todolist.repository;

import com.obinstodo.todolist.model.Task;

import java.util.List;

public interface TaskRepository {
    void addTask(String task);
    void updateTask(String task);
    void deleteTask(String task);
    List<Task> getAllTasks();

    void initializeTasks();
}
