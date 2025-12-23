package com.example.demo.service;

import com.example.demo.models.HotspotZoneModels;

import java.util.List;

public interface HotspotZoneService {

    HotspotZoneModels addZone(HotspotZoneModels zone);

    List<HotspotZoneModels> getAllZones();
}
