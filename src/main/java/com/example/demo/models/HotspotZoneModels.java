package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "hotspot_zones", uniqueConstraints = {
        @UniqueConstraint(columnNames = "zoneName")
})
public class HotspotZone {

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

    public HotspotZone() {}

    public HotspotZone(String zoneName, Double centerLat,
                       Double centerLong, String severityLevel) {
        this.zoneName = zoneName;
        this.centerLat = centerLat;
        this.centerLong = centerLong;
        this.severityLevel = severityLevel;
    }

