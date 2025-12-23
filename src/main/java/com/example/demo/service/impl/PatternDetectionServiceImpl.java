package com.example.demo.service.impl;

import com.example.demo.models.PatternDetectionResultModels;
import com.example.demo.repository.PatternDetectionResultRepository;
import com.example.demo.service.PatternDetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PatternDetectionServiceImpl implements PatternDetectionService {

    @Autowired
    private PatternDetectionResultRepository patternRepository;

    @Override
    public PatternDetectionResultModels detectPattern(Long zoneId) {

        PatternDetectionResultModels result = new PatternDetectionResultModels();
        result.setZoneId(zoneId);
        result.setCrimeCount(0);
        result.setDetectedPattern("No Pattern Detected");
        result.setAnalysisDate(LocalDate.now());

        return patternRepository.save(result);
    }
}
