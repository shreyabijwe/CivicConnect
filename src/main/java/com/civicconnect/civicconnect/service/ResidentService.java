package com.civicconnect.civicconnect.service;

import com.civicconnect.civicconnect.model.Resident;
import com.civicconnect.civicconnect.repository.ResidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ResidentService {

    @Autowired
    private ResidentRepository residentRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Resident registerResident(Resident resident) {
        if (residentRepository.findByEmail(resident.getEmail()).isPresent()) {
            throw new RuntimeException("Email already registered");
        }
        resident.setPassword(passwordEncoder.encode(resident.getPassword()));
        return residentRepository.save(resident);
    }
}