package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class CrimeReport{
    @Id
    private Long id;
    private String crimeType;
    private String description;
    private Double latitude;
    private Double longitude;
    private LocalDateTime occuredAt;
}