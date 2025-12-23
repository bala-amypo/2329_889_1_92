package com.example.demo.service;

import com.example.demo.models.PatternDetectionResultModels;

public interface PatternDetectionService {

    PatternDetectionResultModels detectPattern(Long zoneId);
}
