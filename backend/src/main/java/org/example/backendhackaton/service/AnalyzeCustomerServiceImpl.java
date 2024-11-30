package org.example.backendhackaton.service;

import com.ai.Sparkle;
import com.ai.dataSet.Data;
import org.example.backendhackaton.dto.AnalyzeCustomerDto;
import org.example.backendhackaton.dto.AnalyzeCustomerResponseDto;
import org.springframework.stereotype.Service;

@Service
public class AnalyzeCustomerServiceImpl implements AnalyzeCustomerService {

    @Override
    public AnalyzeCustomerResponseDto analyzeCustomer(AnalyzeCustomerDto request) {
        Sparkle sparkle = new Sparkle();
        Data data = new Data(
                request.getJoinDate(),
                request.getGender(),
                request.getCompanyType(),
                request.getWorksFromHome(),
                request.getWorkload(),
                request.getWorkTime(),
                request.getFatigueScore(), "0");
       Double burnRate = sparkle.getBurnRate(data) * 100;
       String resultExplain = sparkle.resultExplain(data, burnRate);
        return new AnalyzeCustomerResponseDto(burnRate.toString(), resultExplain);
    }
}
