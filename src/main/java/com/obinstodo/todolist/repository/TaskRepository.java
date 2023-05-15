package com.obinstodo.todolist.repository;

import com.obinstodo.todolist.model.Task;

import java.util.List;

public interface TaskRepository {

    List<Task> getAllTasks();
    Task getTaskById(int taskId);
    void addTask(Task task);
    void updateTask(Task task);
    void deleteTask(int taskId);
    void initializeTasks();
}