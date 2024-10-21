package com.divisosoft.internapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.divisosoft.internapp.model.Intern;
import com.divisosoft.internapp.service.InternService;

import java.util.List;

import org.openapitools.client.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/")
public class InternsController {

    @Autowired
    private InternService internService ;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<org.openapitools.client.model.Intern> getInterns() throws ApiException {
        return internService.getInterns();
    }

    @PostMapping("/add")
    public void createIntern(@RequestBody Intern intern) {
         internService.addIntern(intern);
    }
    
    @PutMapping("/update/{id}")
    public void updateIntern(@PathVariable Long id ,@RequestBody Intern intern) {
        internService.updateIntern(id,intern);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteIntern(@PathVariable Long id){
        internService.deleteIntern(id);
    }
    
    
}
