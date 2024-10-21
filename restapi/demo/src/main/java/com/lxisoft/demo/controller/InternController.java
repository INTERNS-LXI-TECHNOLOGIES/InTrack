package com.lxisoft.demo.controller;


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

import com.lxisoft.demo.entity.Intern;
import com.lxisoft.demo.service.InternService;

@RestController
@RequestMapping("/")
public class InternController{
    
    @Autowired
    private InternService internService;

    @PostMapping("/create")
    public void saveIntern(@RequestBody Intern intern){
        
        internService.createIntern(intern);
    }

    @GetMapping("/get")
    public List<Intern> readIntern(){
        return internService.searchIntern();
    }

    @PutMapping("/update")
    public Intern updatedIntern(@PathVariable Long id , @RequestBody Intern intern){

        return internService.updateIntern(id , intern);
        
    }


    @DeleteMapping("/delete")
    public void deletedIntern(@PathVariable Long id){

        internService.deleteIntern(id);
        
    }




}






    