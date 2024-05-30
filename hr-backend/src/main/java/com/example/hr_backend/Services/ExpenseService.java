package com.example.hr_backend.Services;
import com.example.hr_backend.Repositories.ExpenseClaimRepository;
import com.example.hr_backend.entites.ExpenseClaim;
import com.example.hr_backend.Repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseClaimRepository expenseClaimRepository;

    public ExpenseClaim saveExpenseClaim(ExpenseClaim expenseClaim) {
        return expenseClaimRepository.save(expenseClaim);
    }

    public List<ExpenseClaim> getExpenseClaimsByEmployee(Long employeeId) {
        return expenseClaimRepository.findByEmployeeId(employeeId);
    }
}
