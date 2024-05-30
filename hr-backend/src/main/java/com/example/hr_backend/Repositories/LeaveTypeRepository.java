package com.example.hr_backend.Repositories;

import com.example.hr_backend.entites.LeaveType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, Long> {}

