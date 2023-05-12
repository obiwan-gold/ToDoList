package com.obinstodo.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Task {
    private int id;
//    private String title;
    private String description;
//    private Date dueDate;
//    private boolean completed;

    public Task(int id, String description) {
        // Constructor logic here
    }
}
