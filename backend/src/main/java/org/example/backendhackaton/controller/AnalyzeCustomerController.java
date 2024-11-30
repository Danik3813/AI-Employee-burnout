package org.example.backendhackaton.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.example.backendhackaton.dto.AnalyzeCustomerDto;
import org.example.backendhackaton.dto.AnalyzeCustomerResponseDto;
import org.example.backendhackaton.service.AnalyzeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/analyze")
public class AnalyzeCustomerController {

    private final AnalyzeCustomerService analyzeCustomerService;

    @Autowired
    public AnalyzeCustomerController(AnalyzeCustomerService analyzeCustomerService) {
        this.analyzeCustomerService = analyzeCustomerService;
    }

    @Operation(summary = "Анализ клиента", description = "Анализирует данные клиента с использованием внешней библиотеки")
    @PostMapping()
    public AnalyzeCustomerResponseDto analyzeCustomer(@RequestBody AnalyzeCustomerDto request) {
        return analyzeCustomerService.analyzeCustomer(request);
    }
}
