package com.example.intern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.intern.model.Intern;
import com.example.intern.service.InternService;







@RestController
@RequestMapping("/api/intern")


public class InternController {
@Autowired
InternService internService;

@PostMapping("/create")
public Intern postMethodName(@RequestBody Intern intern) {
    if (intern == null) {
        throw new IllegalArgumentException("Intern object is missing in the request body.");
    }
    return internService.createIntern(intern);
}


    @GetMapping("/showall")
    public List<Intern> getMethodName(@RequestParam Intern intern) {
        return internService.getAllIntern();

    }
    
    



    
}
