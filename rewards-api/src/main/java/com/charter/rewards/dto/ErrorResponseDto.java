package com.charter.rewards.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ErrorResponseDto {

	private String errorCode;
    private String errorMessage;
    
}