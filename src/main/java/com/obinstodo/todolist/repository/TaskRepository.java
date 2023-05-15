package com.obinstodo.todolist.repository;

import com.obinstodo.todolist.model.Task;

import java.util.Map;

public interface TaskRepository {

    Map<Integer, Task> getAllTasks();
    Task getTaskById(int taskId);
    void addTask(Task task);
    void updateTask(Task task);
    void deleteTaskById(int taskId);
    void initializeTasks();
}