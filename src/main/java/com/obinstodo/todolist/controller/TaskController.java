package com.obinstodo.todolist.controller;

import com.obinstodo.todolist.model.ErrorResponse;
import com.obinstodo.todolist.model.Task;
import com.obinstodo.todolist.response.ApiResponse;
import com.obinstodo.todolist.service.TaskService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/todo")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public ResponseEntity<ApiResponse<Map<Integer, Task>>> getAllTasks() {
        Map<Integer, Task> tasks = taskService.getAllTasks();

        if (tasks.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(new ApiResponse<>(false, null, new ErrorResponse("Task not found")));
        }

        return ResponseEntity.ok(new ApiResponse<>(true, tasks, null));
    }

    @GetMapping("/tasks/{taskId}")
    public ResponseEntity<ApiResponse<Task>> getTaskById(@PathVariable int taskId) {
        ApiResponse<Task> apiResponse = validateTaskFound(taskService.getTaskById(taskId), taskId);

        if (!apiResponse.isSuccess()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(apiResponse);
        }
        return ResponseEntity.ok(apiResponse);
    }

    @PutMapping("/tasks/{taskId}")
    public ResponseEntity<String> updateTaskById(@PathVariable int taskId, @RequestBody Task updatedTask) {
        // Relegate updating logic to Service layer
        boolean isUpdated = taskService.updateTaskById(taskId, updatedTask);
        // Guard clause to check if task is found first
        if (!isUpdated) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task not updated");
        }
        return ResponseEntity.ok("Task updated successfully!");
    }

    @DeleteMapping("/tasks/{taskId}")
    public ResponseEntity<String> deleteTaskById(@PathVariable int taskId) {

        boolean isDeleted = taskService.deleteTaskById(taskId);

        if (!isDeleted) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task not found");
        }
        return ResponseEntity.ok("Task deleted successfully");
    }

    private ApiResponse<Task> validateTaskFound(Task task, int taskId) {
        if (task == null) {
            return new ApiResponse<>(false, null, new ErrorResponse("Task not found for ID: " + taskId));
        }
        return new ApiResponse<>(true, task, null);
    }

}
