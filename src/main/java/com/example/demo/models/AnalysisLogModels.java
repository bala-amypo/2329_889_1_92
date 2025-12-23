package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
@Table(name = "analysis_logs")
public class AnalysisLogModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long zoneId;

    @NotBlank
    @Size(max = 500)
    private String message;

    private LocalDateTime loggedAt;

    @PrePersist
    public void onCreate() {
        this.loggedAt = LocalDateTime.now();
    }

    public AnalysisLogModels() {}

    // getters and setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getZoneId() {
        return zoneId;
    }
    
    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getLoggedAt() {
        return loggedAt;
    }
    
    public void setLoggedAt(LocalDateTime loggedAt) {
        this.loggedAt = loggedAt;
    }
}
