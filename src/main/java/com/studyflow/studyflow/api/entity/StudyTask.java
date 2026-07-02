package com.studyflow.studyflow.api.entity;

import com.studyflow.studyflow.api.enums.TaskStatus;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class StudyTask {
    private Long id;
    final private String title;
    final private String description;
    private TaskStatus status;
    final private LocalDateTime createdAt;

    public StudyTask (String title, String description) {
        this.title = title;
        this.description = description;
        this.status = TaskStatus.PENDING;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
