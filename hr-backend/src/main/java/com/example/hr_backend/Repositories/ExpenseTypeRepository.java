package com.example.hr_backend.Repositories;

import com.example.hr_backend.entites.ExpenseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ExpenseTypeRepository extends JpaRepository<ExpenseType, Long> {}

