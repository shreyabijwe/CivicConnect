package com.civicconnect.civicconnect.controller;

import com.civicconnect.civicconnect.model.Resident;
import com.civicconnect.civicconnect.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/residents")
public class ResidentController {

    @Autowired
    private ResidentService residentService;

    @PostMapping("/signup")
    public ResponseEntity<Resident> signup(@RequestBody Resident resident) {
        Resident savedResident = residentService.registerResident(resident);
        return ResponseEntity.ok(savedResident);
    }
}