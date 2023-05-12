package com.obinstodo.controller;

import com.obinstodo.model.Task;
import com.obinstodo.service.TaskService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController("api")
public class TaskController {

    @Getter
    @Setter
    private Task task;
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }

//    public void createTask(String title, String description, Date dueDate, boolean completed) {
//        Task task = Task.builder()
//                .title(title)
//                .description(description)
//                .dueDate(dueDate)
//                .completed(completed)
//                .build();
//        setTask(task);
//        }
}
