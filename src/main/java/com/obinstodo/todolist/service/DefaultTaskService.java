package com.obinstodo.todolist.service;

import com.obinstodo.todolist.model.Task;
import com.obinstodo.todolist.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultTaskService implements TaskService {

    public DefaultTaskService(TaskRepository taskRepository) {
        taskRepository.initializeTasks();
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public void addTask(Task task) {

    }

    @Override
    public void updateTask(Task task) {

    }

    @Override
    public void deleteTask(String taskId) {

    }
}
