package com.obinstodo.controller;

import com.obinstodo.model.Task;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TaskController {

    @Getter
    @Setter
    private Task task;

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
