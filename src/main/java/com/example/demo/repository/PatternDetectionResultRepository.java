package com.example.demo.repository;

import com.example.demo.models.PatternDetectionResultModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatternDetectionResultRepository
        extends JpaRepository<PatternDetectionResultModels, Long> {

    List<PatternDetectionResultModels> findByZoneId(Long zoneId);
}
