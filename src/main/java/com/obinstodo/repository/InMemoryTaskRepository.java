package com.obinstodo.repository;

import com.obinstodo.model.Task;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository {

    private final List<Task> tasks;

    public InMemoryTaskRepository() {
        tasks = new ArrayList<>();
    }

    @Override
    public void addTask(String task) {

    }

    @Override
    public void updateTask(String task) {

    }

    @Override
    public void deleteTask(String task) {

    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }
}
