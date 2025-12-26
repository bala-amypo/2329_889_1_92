package com.example.demo.controller;

import com.example.demo.model.CrimeReport;
import com.example.demo.service.CrimeReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class CrimeReportController {

    private final CrimeReportService reportService;

    public CrimeReportController(CrimeReportService reportService) {
        this.reportService = reportService;
    }

    @PostMapping
    public CrimeReport addReport(@RequestBody CrimeReport report) {
        return reportService.addReport(report);
    }

    @GetMapping
    public List<CrimeReport> getAllReports() {
        return reportService.getAllReports();
    }
}
































// package com.example.demo.controller;

// import com.example.demo.model.CrimeReport;
// import com.example.demo.service.CrimeReportService;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RestController
// @RequestMapping("/reports")
// @Tag(name = "Crime Reports")
// public class CrimeReportController {
//     private final CrimeReportService crimeReportService;

//     public CrimeReportController(CrimeReportService crimeReportService) {
//         this.crimeReportService = crimeReportService;
//     }

//     @PostMapping
//     public ResponseEntity<?> addReport(@RequestBody CrimeReport report) {
//         try {
//             CrimeReport saved = crimeReportService.addReport(report);
//             return ResponseEntity.status(201).body(saved);
//         } catch (Exception e) {
//             return ResponseEntity.badRequest().body(e.getMessage());
//         }
//     }

//     @GetMapping
//     public ResponseEntity<List<CrimeReport>> getAllReports() {
//         return ResponseEntity.ok(crimeReportService.getAllReports());
//     }
// }
