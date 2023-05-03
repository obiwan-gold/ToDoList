package com.obinstodo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Task {
    private int id;
    private String title;
    private String description;
    private Date dueDate;
    private boolean completed;
}
