package com.obinstodo.todolist.repository;

import com.obinstodo.todolist.model.Task;

import java.util.List;

public interface TaskRepository {

    void addTask(Task task);
    void updateTask(Task task);
    void deleteTask(String taskId);
    List<Task> getAllTasks();
  
    void initializeTasks();
}