package com.obinstodo.controller;

import com.obinstodo.model.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TaskControllerTest {

    public Task task;
    public TaskController taskController;

    @Test
    void createTask() {
        String title = "Test Task";
        String description = "This is a test task.";
        Date dueDate = new Date();
        boolean completed = false;

        // Call the createTask method on the TaskController
        taskController.createTask(title, description, dueDate, completed);

        // Get the task created by createTask()
        Task task = taskController.getTask();

        // Assert that the task has the correct properties
        Assertions.assertEquals(title, task.getTitle());
        Assertions.assertEquals(description, task.getDescription());
        Assertions.assertEquals(dueDate, task.getDueDate());
        Assertions.assertEquals(completed, task.isCompleted());
    }
}