package org.example.backendhackaton.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AnalyzeCustomerDto {

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getWorksFromHome() {
        return worksFromHome;
    }

    public void setWorksFromHome(String worksFromHome) {
        this.worksFromHome = worksFromHome;
    }

    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getFatigueScore() {
        return fatigueScore;
    }

    public void setFatigueScore(String fatigueScore) {
        this.fatigueScore = fatigueScore;
    }

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
