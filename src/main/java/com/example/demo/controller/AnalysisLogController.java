
package com.example.demo.controller;

import com.example.demo.models.AnalysisLogModels;
import com.example.demo.repository.AnalysisLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class AnalysisLogController {

    @Autowired
    private AnalysisLogRepository analysisLogRepository;

    @PostMapping("/{zoneId}")
    public AnalysisLogModels addLog(@PathVariable Long zoneId,
                                    @RequestBody AnalysisLogModels log) {
        log.setZoneId(zoneId);
        return analysisLogRepository.save(log);
    }

    @GetMapping("/zone/{zoneId}")
    public List<AnalysisLogModels> getLogsByZone(@PathVariable Long zoneId) {
        return analysisLogRepository.findByZoneId(zoneId);
    }
}









// package com.example.demo.controller;

// import com.example.demo.model.AnalysisLog;
// import com.example.demo.service.AnalysisLogService;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import java.util.Map;

// @RestController
// @RequestMapping("/logs")
// @Tag(name = "Analysis Logs")
// public class AnalysisLogController {
//     private final AnalysisLogService analysisLogService;

//     public AnalysisLogController(AnalysisLogService analysisLogService) {
//         this.analysisLogService = analysisLogService;
//     }

//     @PostMapping("/{zoneId}")
//     public ResponseEntity<?> addLog(@PathVariable Long zoneId, @RequestBody Map<String, String> body) {
//         try {
//             String message = body.get("message");
//             AnalysisLog log = analysisLogService.addLog(zoneId, message);
//             return ResponseEntity.status(201).body(log);
//         } catch (Exception e) {
//             return ResponseEntity.status(404).body(e.getMessage());
//         }
//     }

//     @GetMapping("/zone/{zoneId}")
//     public ResponseEntity<List<AnalysisLog>> getLogsByZone(@PathVariable Long zoneId) {
//         return ResponseEntity.ok(analysisLogService.getLogsByZone(zoneId));
//     }
// }