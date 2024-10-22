package com.lxi.intern.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxi.intern.models.Intern;
import com.lxi.intern.service.InternService;

@RestController
@RequestMapping("/intern")
public class InternController {

    @Autowired
    private InternService internService;

    @PostMapping
    public void createIntern(@RequestBody Intern intern) {
       
         internService.createIntern(intern);
    }

    @GetMapping
    public List<Intern> getAllInterns() {
       
        return  internService.getInterns();
    }

    @PutMapping("/{id}")
    public void upadteIntern(@PathVariable Long id, @RequestBody Intern intern){
        internService.update(id,intern);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        internService.delete(id);
    }

    @GetMapping("/{id}")
    public Intern getInternById(@PathVariable Long id){
        Optional<Intern>myInternOptional = internService.getIternsById(id);
        if(myInternOptional!=null){
            return myInternOptional.get();
        }
        else{
            return null;
        }
    }

}
