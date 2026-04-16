package com.charter.rewards.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor   // generates a constructor with all fields
public class RewardResponseDto {
    private Long customerId;
    private String customerName;
    private String customerEmail;
    private Map<String, Double> monthlyPoints; // month-year -> points
    private double totalPoints;
    private List<TransactionDto> transactions;

}