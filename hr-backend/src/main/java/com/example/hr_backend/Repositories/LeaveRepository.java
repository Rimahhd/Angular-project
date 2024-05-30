package com.example.hr_backend.Repositories;

import com.example.hr_backend.entites.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

public interface LeaveRepository extends JpaRepository<Leave, Long> {
    List<Leave> findByEmployeeIdAndFromDateBetween(Long employeeId, Date fromDate, Date toDate);
}
