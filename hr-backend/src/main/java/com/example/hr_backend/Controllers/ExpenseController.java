package com.example.hr_backend.Controllers;


import com.example.hr_backend.entites.ExpenseClaim;
import com.example.hr_backend.Services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public ExpenseClaim createExpenseClaim(@RequestBody ExpenseClaim expenseClaim) {
        return expenseService.saveExpenseClaim(expenseClaim);
    }

    @GetMapping("/employee/{employeeId}")
    public List<ExpenseClaim> getExpenseClaimsByEmployee(@PathVariable Long employeeId) {
        return expenseService.getExpenseClaimsByEmployee(employeeId);
    }
}
