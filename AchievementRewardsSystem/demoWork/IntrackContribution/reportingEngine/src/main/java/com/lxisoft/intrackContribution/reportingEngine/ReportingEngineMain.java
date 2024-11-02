package com.lxisoft.intrackContribution.reportingEngine;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.BalancedScoreCardControllerApi;
import org.openapitools.client.model.BalancedScoreCardEntity;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

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

    public String bscReport(String report) throws JRException, IOException {
    List<BalancedScoreCardEntity> formatBsc = printingAllDetails();

    InputStream reportStream = new ClassPathResource("bscreport.jrxml").getInputStream();
    JasperReport jasperReport = JasperCompileManager.compileReport(reportStream);
    
    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(formatBsc);
    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);
    String destinationPath = "E:\\LXI\\IntrackContribution\\jasperReport\\";
    
    if (report.equalsIgnoreCase("html")) {
        JasperExportManager.exportReportToHtmlFile(jasperPrint, destinationPath + "bscReport.html");
    } else if (report.equalsIgnoreCase("pdf")) {
        JasperExportManager.exportReportToPdfFile(jasperPrint, destinationPath + "bscReport.pdf");
    }
    
    return "Report successfully generated";
}
    
}
