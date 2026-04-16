package com.charter.rewards.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor   // generates a constructor with all fields
public class TransactionDto {
    private Long id;
    private BigDecimal amount; 
    private LocalDateTime transactionDate;
    private double rewardPoints;
}