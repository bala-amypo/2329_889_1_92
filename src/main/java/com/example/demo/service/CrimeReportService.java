package com.example.demo.service;

import com.example.demo.models.CrimeReportModels;

import java.util.List;

public interface CrimeReportService {

    CrimeReportModels addReport(CrimeReportModels report);

    List<CrimeReportModels> getAllReports();
}
