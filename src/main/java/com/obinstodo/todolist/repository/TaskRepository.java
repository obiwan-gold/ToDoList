package com.obinstodo.todolist.repository;

import com.obinstodo.todolist.model.Task;

import java.util.Map;

public interface TaskRepository {
    void initializeTasks();
    boolean checkTaskExistsById(int taskId);
    int getTaskMapSize();
    Map<Integer, Task> getAllTasks();
    Task getTaskById(int taskId);
    void createTask(Task task);
    void updateTask(Task task);
    boolean deleteTaskById(int taskId);
}