package com.obinstodo.todolist.service;

import com.obinstodo.todolist.model.Task;

import java.util.Map;


public interface TaskService {
    Map<Integer, Task> getAllTasks();
    Task getTaskById(int taskId);
    void addTask(Task task);
    void updateTask(Task task);
    void deleteTaskById(int taskId);
}
