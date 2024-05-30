package com.example.hr_backend.entites;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Data
public class ExpenseClaim {
    @Getter
    @Setter
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private String description;
    private double total;
    private String status;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}

