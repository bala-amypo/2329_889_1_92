package com.example.demo.repository;

import com.example.demo.models.HotspotZoneModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotspotZoneRepository extends JpaRepository<HotspotZoneModels, Long> {
}
