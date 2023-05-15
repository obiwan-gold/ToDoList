package com.obinstodo.todolist.repository;

import com.obinstodo.todolist.model.Task;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryTaskRepository implements TaskRepository {

    private final Map<Integer, Task> tasks;

    public InMemoryTaskRepository() {
        tasks = new HashMap<>();
        initializeTasks();
    }

    public void initializeTasks() {

        Task task1 = new Task(1, "Title 1", "Description 1", LocalDate.of(2023, 5, 15), false);
        Task task2 = new Task(2, "Title 2", "Description 2", LocalDate.of(2023, 5, 15), false);
        Task task3 = new Task(3, "Title 3", "Description 3", LocalDate.of(2023, 5, 15), false);
        tasks.put(task1.getTaskId(), task1);
        tasks.put(task2.getTaskId(), task2);
        tasks.put(task3.getTaskId(), task3);
    }

    @Override
    public Map<Integer, Task> getAllTasks() {
        return tasks;
    }

    @Override
    public Task getTaskById(int taskId) {
        return tasks.get(taskId);
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
    public void deleteTaskById(int taskId) {
        // Implement the logic to delete a task from the repository
    }


}
