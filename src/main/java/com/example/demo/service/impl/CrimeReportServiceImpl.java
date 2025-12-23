package com.example.demo.service.impl;

import com.example.demo.models.CrimeReportModels;
import com.example.demo.repository.CrimeReportRepository;
import com.example.demo.service.CrimeReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrimeReportServiceImpl implements CrimeReportService {

    @Autowired
    private CrimeReportRepository crimeReportRepository;

    @Override
    public CrimeReportModels addReport(CrimeReportModels report) {
        return crimeReportRepository.save(report);
    }

    @Override
    public List<CrimeReportModels> getAllReports() {
        return crimeReportRepository.findAll();
    }
}
