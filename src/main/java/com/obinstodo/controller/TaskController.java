package com.obinstodo.controller;

import com.obinstodo.model.Task;
import lombok.Builder;


import java.util.Date;


public class TaskController {

    public void createTask(String title, String description, Date dueDate) {
        Task task = Task.builder()
                .title(title)
                .description(description)
                .dueDate(dueDate)
                .build();
        // save the task to the database or do something else with it
    }
}
