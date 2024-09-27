/*package com.divisosofttech.intrack.holisticlearningframework.controller;

import com.divisosofttech.intrack.holisticlearningframework.entity.MentalDimention;
import com.divisosofttech.intrack.holisticlearningframework.service.MentalDimentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import jakarta.servlet.http.HttpServlet;

@Controller
@RequestMapping("/mental-dimension")
public class MentalDimentionController extends HttpServlet {

    @Autowired
    private MentalDimentionService mentalDimentionService;

    // Display all Mental Dimensions (Read)
    @GetMapping("/list")
    public String listMentalDimensions(Model model) {
        List<MentalDimention> dimensions = mentalDimentionService.getAllMentalDimentions();
        model.addAttribute("dimensions", dimensions);
        return "mental-dimension-list"; // Corresponds to the Thymeleaf page mental-dimension-list.html
    }

    // Display form for adding a new Mental Dimension (Create)
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("mentalDimention", new MentalDimention());
        return "create-mental-dimension"; // Corresponds to the Thymeleaf page create-mental-dimension.html
    }

    // Process the form submission for adding a new Mental Dimension
    @PostMapping("/create")
    public String createMentalDimension(@ModelAttribute("mentalDimention") MentalDimention mentalDimention) {
        mentalDimentionService.saveMentalDimention(mentalDimention);
        return "redirect:/mental-dimension/list"; // Redirect to the list page after creating
    }
}
*/