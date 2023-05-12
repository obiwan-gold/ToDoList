package com.obinstodo.todolist.repository;

import com.obinstodo.todolist.model.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryTaskRepository implements TaskRepository {

    private final List<Task> tasks;

    public InMemoryTaskRepository() {
        tasks = new ArrayList<>();
        initializeTasks();
    }

    public void initializeTasks() {

        // Initialize tasks
    }

    @Override
    public void addTask(Task task) {
        // Implement the logic to add a task to the repository
    }

    @Override
    public void updateTask(Task task) {
        // Implement the logic to update a task in the repository
    }

    @Override
    public void deleteTask(String taskId) {
        // Implement the logic to delete a task from the repository
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }
}
