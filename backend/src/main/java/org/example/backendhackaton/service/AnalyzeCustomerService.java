package org.example.backendhackaton.service;


import org.example.backendhackaton.dto.AnalyzeCustomerDto;
import org.example.backendhackaton.dto.AnalyzeCustomerResponseDto;

public interface AnalyzeCustomerService {
    AnalyzeCustomerResponseDto analyzeCustomer(AnalyzeCustomerDto request);
}
