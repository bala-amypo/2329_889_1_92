package com.example.demo.service.impl;

import com.example.demo.models.HotspotZoneModels;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.HotspotZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotspotZoneServiceImpl implements HotspotZoneService {

    @Autowired
    private HotspotZoneRepository hotspotZoneRepository;

    @Override
    public HotspotZoneModels addZone(HotspotZoneModels zone) {
        return hotspotZoneRepository.save(zone);
    }

    @Override
    public List<HotspotZoneModels> getAllZones() {
        return hotspotZoneRepository.findAll();
    }
}
