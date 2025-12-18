package com.example.demo.model;

import jakarta.persistence.Id;

public class PattrenDetectionResult{
    @Id;
    private Long Id;
    private LocalDate analysisDate;
    private Integer crimeCount;
    private String detectedPattern;


}