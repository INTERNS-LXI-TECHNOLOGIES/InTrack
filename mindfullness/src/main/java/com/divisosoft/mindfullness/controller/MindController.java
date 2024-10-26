package com.divisosoft.mindfullness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.divisosoft.mindfullness.model.Activities;
import com.divisosoft.mindfullness.model.UserPreference;
import com.divisosoft.mindfullness.repository.UserPreferenceRepository;
import com.divisosoft.mindfullness.service.MindService;

@Controller
@RequestMapping("/")
public class MindController {

    @Autowired
    private MindService mindService;

    @Autowired
    private UserPreferenceRepository userPreferenceRepository;

    @GetMapping
    public String getFirstPage(Model model) {
        List<UserPreference> activities = mindService.getActivity();
        model.addAttribute("userpreference", activities);
        return "first";
    }

    @PostMapping("/updateFrequency")
    public String updateFrequency(@RequestParam Long id, @RequestParam String frequency) {
        UserPreference preference = userPreferenceRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user preference ID: " + id));
        preference.setFrequency(frequency);
        userPreferenceRepository.save(preference);
        return "updateSuccess";
    }

}
