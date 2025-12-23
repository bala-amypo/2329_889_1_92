package com.example.demo.repository;

import com.example.demo.models.CrimeReportModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrimeReportRepository extends JpaRepository<CrimeReportModels, Long> {
}
