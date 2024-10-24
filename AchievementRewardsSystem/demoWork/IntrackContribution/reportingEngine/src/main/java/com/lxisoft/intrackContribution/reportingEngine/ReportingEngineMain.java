package com.lxisoft.intrackContribution.reportingEngine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.BalancedScoreCardControllerApi;
import org.openapitools.client.model.BalancedScoreCardEntity;
import org.springframework.stereotype.Service;

@Service
public class ReportingEngineMain {

    public List<BalancedScoreCardEntity> printingAllDetails() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8081");

        List<BalancedScoreCardEntity> bringAll = new ArrayList<>();
        BalancedScoreCardControllerApi bscApi = new BalancedScoreCardControllerApi(apiClient);

        try {
            bringAll = bscApi.showDetails();
        } catch (Exception e) {
            e.getMessage();
        }
        return bringAll;
    }

    public List<BalancedScoreCardEntity> filterBalancedScoreCards(String nameFilter, String scoreOrder) {
        List<BalancedScoreCardEntity> allDetails = printingAllDetails();

        if (nameFilter != null && !nameFilter.isEmpty()) {
            allDetails = allDetails.stream()
                    .filter(n -> n.getName().startsWith(nameFilter))
                    .collect(Collectors.toList());
        }

        if ("highest".equalsIgnoreCase(scoreOrder)) {
            allDetails = allDetails.stream()
                    .sorted(Comparator.comparing(BalancedScoreCardEntity::getTotalAnalizedScore).reversed())
                    .collect(Collectors.toList());
        } else if ("lowest".equalsIgnoreCase(scoreOrder)) {
            allDetails = allDetails.stream()
                    .sorted(Comparator.comparing(BalancedScoreCardEntity::getTotalAnalizedScore))
                    .collect(Collectors.toList());
        }

        return allDetails;
    }
}
