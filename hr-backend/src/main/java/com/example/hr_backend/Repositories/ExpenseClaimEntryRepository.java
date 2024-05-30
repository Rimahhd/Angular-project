package com.example.hr_backend.Repositories;

import com.example.hr_backend.entites.ExpenseClaimEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ExpenseClaimEntryRepository extends JpaRepository<ExpenseClaimEntry, Long> {}
