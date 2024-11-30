package org.example.backendhackaton.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AnalyzeCustomerDto {

    @Schema(description = "Дата присоединения клиента в компанию YYYY-MM-DD", example = "2022-01-01")
    private String joinDate;

    @Schema(description = "Пол клиента (например, male, female)", example = "Male")
    private String gender;

    @Schema(description = "Тип компании (только service или product)", example = "Service")
    private String companyType;

    @Schema(description = "Работает ли клиент из дома (yes/no)", example = "Yes")
    private String worksFromHome;

    @Schema(description = "Загруженность клиента (0 - 5)", example = "4.2")
    private String workload;

    @Schema(description = "Время работы клиента в часах (например, 7)", example = "7")
    private String workTime;

    @Schema(description = "Оценка усталости клиента (числовое значение 0 - 10)", example = "7.2")
    private String fatigueScore;

}
