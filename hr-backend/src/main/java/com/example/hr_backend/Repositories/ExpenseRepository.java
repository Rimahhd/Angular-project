package com.example.hr_backend.Repositories;

import com.example.hr_backend.entites.ExpenseClaim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ExpenseRepository extends JpaRepository<ExpenseClaim, Long> {
}