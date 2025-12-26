package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "crime_reports")
public class CrimeReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String crimeType;
    private String description;
    private Double latitude;
    private Double longitude;
    private LocalDateTime occurredAt;

    public CrimeReport() {
    }

    public CrimeReport(String crimeType, String description,
                       Double latitude, Double longitude,
                       LocalDateTime occurredAt) {
        this.crimeType = crimeType;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.occurredAt = occurredAt;
    }

    // getters and setters
}
