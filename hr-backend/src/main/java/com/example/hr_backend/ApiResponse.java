package com.example.hr_backend;

import lombok.Data;

@Data
public class ApiResponse {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
}
