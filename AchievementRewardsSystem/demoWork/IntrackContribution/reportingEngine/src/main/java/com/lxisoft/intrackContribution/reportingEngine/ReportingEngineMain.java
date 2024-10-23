package com.lxisoft.intrackContribution.reportingEngine;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.BalancedScoreCardControllerApi;
import org.openapitools.client.model.BalancedScoreCardEntity;
import org.springframework.stereotype.Service;

@Service
public class ReportingEngineMain{

    public List<BalancedScoreCardEntity> printingAllDetails(){
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8081");

        List<BalancedScoreCardEntity> bringAll =new ArrayList<>();
        BalancedScoreCardControllerApi bscApi =new BalancedScoreCardControllerApi(apiClient);

        try {
            bringAll= bscApi.showDetails();
        } catch (Exception e) {
            e.getMessage();
        }
        return bringAll;
    }
}