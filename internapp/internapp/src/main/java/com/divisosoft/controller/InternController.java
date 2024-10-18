package com.divisosoft.controller;

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

import com.divisosoft.model.Intern;
import com.divisosoft.repository.InternRepository;
import com.divisosoft.service.InternService;

@RestController
@RequestMapping("/")
public class InternController {

    @Autowired
    private InternRepository internRepository;

    @Autowired
    private InternService service;
    
    @GetMapping
    public List<Intern> getIntern() {
        return internRepository.findAll();
    }

    @PostMapping("/create")
    public void createIntern(@RequestBody Intern intern) {
        internRepository.save(intern);
    }

    @PutMapping("/{id}")
    public void updateInterns(@PathVariable Long id, @RequestBody Intern intern){
        service.updateIntern(id,intern);
    }

    @DeleteMapping("/{id}")
    public void deleteInterns(@PathVariable Long id){
        internRepository.deleteById(id);
    }

    

}
