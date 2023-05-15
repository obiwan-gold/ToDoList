package com.obinstodo.todolist.service;

import com.obinstodo.todolist.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(int taskId);
    void addTask(Task task);
    void updateTask(Task task);
    void deleteTask(int taskId);
}
