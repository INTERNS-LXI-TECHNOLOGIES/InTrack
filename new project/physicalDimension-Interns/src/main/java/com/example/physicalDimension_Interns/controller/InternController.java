package com.example.physicalDimension_Interns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.physicalDimension_Interns.model.Intern;
import com.example.physicalDimension_Interns.service.InternService;

@RestController
@RequestMapping("/Interns")
public class InternController {
  
  @Autowired
  private InternService internService;

  @GetMapping
  public List<Intern> getAllIntern() {
        return internService.getAllInterns();
    }

  @PostMapping
  public void saveIntern(@RequestBody Intern intern) {
        internService.assignIntern(intern);
    }

  @PutMapping("/{id}")
    public void updateIntern(@PathVariable Long id, @RequestBody Intern intern) {
        internService.updateIntern(id, intern);
    }

    @DeleteMapping("/{id}")
    public void deleteIntern(@PathVariable Long id) {
        internService.deleteIntern(id);
    }

}
