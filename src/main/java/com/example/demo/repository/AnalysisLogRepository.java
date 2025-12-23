package com.example.demo.repository;

import com.example.demo.models.AnalysisLogModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnalysisLogRepository
        extends JpaRepository<AnalysisLogModels, Long> {

    List<AnalysisLogModels> findByZoneId(Long zoneId);
}
