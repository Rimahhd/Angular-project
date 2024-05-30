package com.example.hr_backend.Services;

import com.example.hr_backend.entites.Leave;
import com.example.hr_backend.Repositories.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LeaveService {
    @Autowired
    private LeaveRepository leaveRepository;

    public Leave saveLeave(Leave leave) {
        return leaveRepository.save(leave);
    }

    public List<Leave> getLeavesByEmployeeAndDateRange(Long employeeId, Date fromDate, Date toDate) {
        return leaveRepository.findByEmployeeIdAndFromDateBetween(employeeId, fromDate, toDate);
    }
}

