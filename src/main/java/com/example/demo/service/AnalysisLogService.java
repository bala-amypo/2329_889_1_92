package com.example.demo.service;

import com.example.demo.models.AnalysisLogModels;

import java.util.List;

public interface AnalysisLogService {

    // AnalysisLogModels addLog(AnalysisLogModels log);

    List<AnalysisLogModels> getLogsByZone(Long zoneId);
}
