package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "pattern_detection_results")
public class PatternDetectionResultModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long zoneId;

    private LocalDate analysisDate;

    @NotNull
    private Integer crimeCount;

    @NotBlank
    private String detectedPattern;

    @PrePersist
    public void onCreate() {
        this.analysisDate = LocalDate.now();
    }

    public PatternDetectionResultModels() {}

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

    public LocalDate getAnalysisDate() {
        return analysisDate;
    }
    
    public void setAnalysisDate(LocalDate analysisDate) {
        this.analysisDate = analysisDate;
    }

    public Integer getCrimeCount() {
        return crimeCount;
    }
    
    public void setCrimeCount(Integer crimeCount) {
        this.crimeCount = crimeCount;
    }

    public String getDetectedPattern() {
        return detectedPattern;
    }
    
    public void setDetectedPattern(String detectedPattern) {
        this.detectedPattern = detectedPattern;
    }
}
