package com.obinstodo.todolist.service;

import com.obinstodo.todolist.model.Task;

import java.util.Map;


public interface TaskService {
    Map<Integer, Task> getAllTasks();
    Task getTaskById(int taskId);
    void createTask(Task task);

    boolean updateTaskById(int taskId, Task updatedTask);

    boolean deleteTaskById(int taskId);
}
