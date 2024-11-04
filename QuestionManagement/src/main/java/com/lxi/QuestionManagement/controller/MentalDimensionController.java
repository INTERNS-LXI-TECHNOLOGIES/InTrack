package com.lxi.QuestionManagement.controller;

import com.lxi.QuestionManagement.entity.*;
import com.lxi.QuestionManagement.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mental")
public class MentalDimensionController {

    @Autowired
    private MentalDimensionService service;

    @PostMapping
    public MentalDimension create(@RequestBody MentalDimension mentalDimension) {
        return service.save(mentalDimension);
    }

    @GetMapping
    public List<MentalDimension> getAll() {
        return service.getAll();
    }

    
    @GetMapping("/{id}")
    public MentalDimension getById(@PathVariable Long id) {
    Optional<MentalDimension> mentalDimensionOptional = service.getById(id);
        return mentalDimensionOptional.orElse(null); 
    }


    
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody MentalDimension updatedMentalDimension) {
        service.update(id, updatedMentalDimension);
    }
    

    
    @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
