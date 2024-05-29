package com.example.hr_backend.Services;

import com.example.hr_backend.entites.Leave;
import com.example.hr_backend.Repositories.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveService {

    @Autowired
    private LeaveRepository leaveRepository;

    public List<Leave> getAllLeaves() {
        return leaveRepository.findAll();
    }

    public Leave getLeaveById(Long id) {
        return leaveRepository.findById(id).orElse(null);
    }

    public Leave createLeave(Leave leave) {
        return leaveRepository.save(leave);
    }
}
