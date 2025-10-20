package com.example.taskrunner.controller;

import com.example.taskrunner.model.Task;
import com.example.taskrunner.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // ✅ Root message (optional)
   

    // ✅ Create a new task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    // ✅ Get all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // ✅ Get a task by ID
    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable String id) {
        return taskService.getTaskById(id);
    }
}
