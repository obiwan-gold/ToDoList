package com.obinstodo.controller;

import com.obinstodo.model.Task;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class TaskController {

    @Getter
    @Setter
    private Task task;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        // Retrieve the tasks from the data source or repository

        // Return the tasks as the response with an appropriate HTTP status code
        return ResponseEntity.ok(tasks);
    }

    public void createTask(String title, String description, Date dueDate, boolean completed) {
        Task task = Task.builder()
                .title(title)
                .description(description)
                .dueDate(dueDate)
                .completed(completed)
                .build();
        setTask(task);
        }
}
