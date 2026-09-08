package com.civicconnect.civicconnect.repository;

import com.civicconnect.civicconnect.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}