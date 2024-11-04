package com.lxi.QuestionManagement.controller;

import com.lxi.QuestionManagement.entity.SocialDimension;
import com.lxi.QuestionManagement.service.SocialDimensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/social")
public class SocialDimensionController {

    @Autowired
    private SocialDimensionService service;

    @PostMapping
    public SocialDimension create(@RequestBody SocialDimension socialDimension) {
        return service.save(socialDimension);
    }

    @GetMapping
    public List<SocialDimension> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public SocialDimension getById(@PathVariable Long id) {
        Optional<SocialDimension> socialDimensionOptional = service.getById(id);
        return socialDimensionOptional.orElse(null); 
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody SocialDimension updatedSocialDimension) {
        service.update(id, updatedSocialDimension);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
