package com.example.demo.service.impl;

import com.example.demo.models.AnalysisLogModels;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.service.AnalysisLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    @Autowired
    private AnalysisLogRepository analysisLogRepository;

    @Override
    public AnalysisLogModels addLog(AnalysisLogModels log) {
        return analysisLogRepository.save(log);
    }

    @Override
    public List<AnalysisLogModels> getLogsByZone(Long zoneId) {
        return analysisLogRepository.findByZoneId(zoneId);
    }
}
