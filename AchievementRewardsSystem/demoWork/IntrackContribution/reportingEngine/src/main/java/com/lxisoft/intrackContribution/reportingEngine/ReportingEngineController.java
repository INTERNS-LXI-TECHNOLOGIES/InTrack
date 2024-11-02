package com.lxisoft.intrackContribution.reportingEngine;

import java.io.IOException;
import java.util.List;

import org.openapitools.client.model.BalancedScoreCardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.sf.jasperreports.engine.JRException;

@Controller
@RequestMapping("/get")
public class ReportingEngineController {

    @Autowired
    private ReportingEngineMain repEngineMain;

    @GetMapping("/show")
    public String showDetails(Model model,
                              @RequestParam(required = false) String nameFilter,
                              @RequestParam(required = false) String scoreOrder) {

        List<BalancedScoreCardEntity> balancedScoreCards = repEngineMain.filterBalancedScoreCards(nameFilter, scoreOrder);
        
        model.addAttribute("balancedScoreCards", balancedScoreCards);
        return "reportingEngine"; // This should point to your Thymeleaf template
    }

    @GetMapping("/report/{newFormat}")
    public String generateReport(@PathVariable String newFormat, RedirectAttributes redirectAttributes) throws JRException, IOException {
        String message = repEngineMain.bscReport(newFormat);
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/get/show"; // Redirect to the show details page after report generation
    }
}
