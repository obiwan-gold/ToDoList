package com.obinstodo.todolist.service;

import com.obinstodo.todolist.model.Task;
import com.obinstodo.todolist.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultTaskService implements TaskService {
    private final List<Task> tasks;
    private final TaskRepository taskRepository;

    public DefaultTaskService(List<Task> tasks, TaskRepository taskRepository) {
        this.tasks = tasks;
        this.taskRepository = taskRepository;
        initializeTasks();
    }

    private void initializeTasks() {
        Task task1 = new Task(1, "Description 1");
        Task task2 = new Task(2, "Description 2");
        Task task3 = new Task(3, "Description 3");

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    @Override
    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    @Override
    public void updateTask(Task task) {
        taskRepository.updateTask(task);
    }

    @Override
    public void deleteTask(String taskId) {
        taskRepository.deleteTask(taskId);
    }
}

