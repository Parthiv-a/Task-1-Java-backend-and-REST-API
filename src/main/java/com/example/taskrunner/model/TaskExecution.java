package com.example.taskrunner.model;

public class TaskExecution {
    private Long taskId;
    private String output;
    private String status;

    public TaskExecution(Long taskId, String output, String status) {
        this.taskId = taskId;
        this.output = output;
        this.status = status;
    }

    public Long getTaskId() {
        return taskId;
    }

    public String getOutput() {
        return output;
    }

    public String getStatus() {
        return status;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
