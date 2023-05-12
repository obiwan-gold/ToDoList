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
        Task task1 = new Task(1, "Description 1");
        Task task2 = new Task(2, "Description 2");
        Task task3 = new Task(3, "Description 3");

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
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
