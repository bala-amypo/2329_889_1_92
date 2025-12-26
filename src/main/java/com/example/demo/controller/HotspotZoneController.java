package com.example.demo.controller;

import com.example.demo.model.HotspotZone;
import com.example.demo.service.HotspotZoneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zones")
public class HotspotZoneController {

    private final HotspotZoneService zoneService;

    public HotspotZoneController(HotspotZoneService zoneService) {
        this.zoneService = zoneService;
    }

    @PostMapping
    public HotspotZone addZone(@RequestBody HotspotZone zone) {
        return zoneService.addZone(zone);
    }

    @GetMapping
    public List<HotspotZone> getAllZones() {
        return zoneService.getAllZones();
    }
}
















// package com.example.demo.controller;

// import com.example.demo.model.HotspotZone;
// import com.example.demo.service.HotspotZoneService;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RestController
// @RequestMapping("/zones")
// @Tag(name = "Hotspot Zones")
// public class HotspotZoneController {
//     private final HotspotZoneService hotspotZoneService;

//     public HotspotZoneController(HotspotZoneService hotspotZoneService) {
//         this.hotspotZoneService = hotspotZoneService;
//     }

//     @PostMapping
//     public ResponseEntity<?> addZone(@RequestBody HotspotZone zone) {
//         try {
//             HotspotZone saved = hotspotZoneService.addZone(zone);
//             return ResponseEntity.status(201).body(saved);
//         } catch (Exception e) {
//             return ResponseEntity.badRequest().body(e.getMessage());
//         }
//     }

//     @GetMapping
//     public ResponseEntity<List<HotspotZone>> getAllZones() {
//         return ResponseEntity.ok(hotspotZoneService.getAllZones());
//     }
// }