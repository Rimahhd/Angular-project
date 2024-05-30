package com.example.hr_backend.Controllers;


import com.example.hr_backend.entites.Leave;
import com.example.hr_backend.Services.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/leaves")
public class LeaveController {
    @Autowired
    private LeaveService leaveService;

    @PostMapping
    public Leave createLeave(@RequestBody Leave leave) {
        return leaveService.saveLeave(leave);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Leave> getLeavesByEmployeeAndDateRange(@PathVariable Long employeeId, @RequestParam Date fromDate, @RequestParam Date toDate) {
        return leaveService.getLeavesByEmployeeAndDateRange(employeeId, fromDate, toDate);
    }
}

