package com.lxisoft.intrackContribution.reportingEngine;

import java.util.List;

import org.openapitools.client.model.BalancedScoreCardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/get")
public class ReportingEngineController {

    @Autowired
    private ReportingEngineMain repEngineMain;

    @GetMapping
    public String showDetails(Model model,
                              @RequestParam(required = false) String nameFilter,
                              @RequestParam(required = false) String scoreOrder) {

        List<BalancedScoreCardEntity> balancedScoreCards = repEngineMain.filterBalancedScoreCards(nameFilter, scoreOrder);
        
        model.addAttribute("balancedScoreCards", balancedScoreCards);
        return "reportingEngine";
    }
}