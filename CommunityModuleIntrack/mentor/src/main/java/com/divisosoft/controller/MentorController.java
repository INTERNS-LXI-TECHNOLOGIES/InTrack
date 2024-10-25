package com.divisosoft.controller;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Intern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import com.divisosoft.service.MentorService;

@Controller
@RequestMapping("/")
public class MentorController {

@Autowired
MentorService mentorService;

@GetMapping("/get")
public String getInterns(Model model) throws ApiException {
    List<Intern> interns = mentorService.getIntern();
    model.addAttribute("interns", interns);
    return "mentor";
}

@PostMapping("/submitFeedback")
public String submitFeedback(@RequestParam("internId") Long internId,
                              @RequestParam("feedback") String feedback){
            mentorService.savefeedback(internId,feedback);
        return "redirect:/get";
    }

}
