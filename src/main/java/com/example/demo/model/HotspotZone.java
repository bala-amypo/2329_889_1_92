package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "hotspot_zones", uniqueConstraints = {
        @UniqueConstraint(columnNames = "zoneName")
})
public class HotspotZoneModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String zoneName;

    @NotNull
    private Double centerLat;

    @NotNull
    private Double centerLong;

    @NotBlank
    private String severityLevel = "LOW";

    private Double radiusMeters = 0.1;

    public HotspotZoneModels() {}

    // getters and setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getZoneName() {
        return zoneName;
    }
    
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public Double getCenterLat() {
        return centerLat;
    }
    
    public void setCenterLat(Double centerLat) {
        this.centerLat = centerLat;
    }

    public Double getCenterLong() {
        return centerLong;
    }
    
    public void setCenterLong(Double centerLong) {
        this.centerLong = centerLong;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }
    
    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public Double getRadiusMeters() {
        return radiusMeters;
    }
    
    public void setRadiusMeters(Double radiusMeters) {
        this.radiusMeters = radiusMeters;
    }
}
