package com.obinstodo.todolist.controller;

import com.obinstodo.todolist.model.Task;
import com.obinstodo.todolist.service.TaskService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public ResponseEntity<Map<Integer, Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @GetMapping("/tasks/{taskId}")
    public ResponseEntity<Task> getTaskById(@PathVariable int taskId) {
        return ResponseEntity.ok(taskService.getTaskById(taskId));
    }

    @DeleteMapping("/tasks/{taskId}")
    public ResponseEntity<String> deleteTaskById(@PathVariable int taskId) {
            boolean isDeleted = taskService.deleteTaskById(taskId);
            return isDeleted
                    ? ResponseEntity.ok("Task deleted successfully")
                    : ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task not found");

    }


}
