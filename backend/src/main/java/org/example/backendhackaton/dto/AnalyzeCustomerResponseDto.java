package org.example.backendhackaton.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnalyzeCustomerResponseDto {

    @Schema(description = "Процент выгорания", example = "60 %")
    private String burnRatePercent;

    @Schema(description = "Предложения", example = "Это предложение")
    private String recommendations;

    public AnalyzeCustomerResponseDto(String burnRatePercent, String recommendations) {
        this.burnRatePercent = burnRatePercent;
        this.recommendations = recommendations;
    }
}
