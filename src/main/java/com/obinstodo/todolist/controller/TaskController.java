package com.obinstodo.todolist.controller;

import com.obinstodo.todolist.model.Task;
import com.obinstodo.todolist.service.TaskService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
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
        List<Task> tasks = new ArrayList<>();

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
