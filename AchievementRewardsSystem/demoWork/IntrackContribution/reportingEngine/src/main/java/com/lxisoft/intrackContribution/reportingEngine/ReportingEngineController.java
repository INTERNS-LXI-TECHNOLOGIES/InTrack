package com.lxisoft.intrackContribution.reportingEngine;

import java.util.List;
import org.openapitools.client.model.BalancedScoreCardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/get")
public class ReportingEngineController {

    @Autowired
    private ReportingEngineMain repEngineMain;

    @GetMapping
    public String showDetails(Model model) {
        List<BalancedScoreCardEntity> balancedScoreCards = repEngineMain.printingAllDetails();
        model.addAttribute("balancedScoreCards", balancedScoreCards);
        return "reportingEngine";
    }
}
