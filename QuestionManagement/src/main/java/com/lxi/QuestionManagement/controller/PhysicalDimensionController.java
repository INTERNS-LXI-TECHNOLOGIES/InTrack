package com.lxi.QuestionManagement.controller;

import com.lxi.QuestionManagement.entity.PhysicalDimension;
import com.lxi.QuestionManagement.service.PhysicalDimensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/physical")
public class PhysicalDimensionController {

    @Autowired
    private PhysicalDimensionService service;

    @PostMapping
    public PhysicalDimension create(@RequestBody PhysicalDimension physicalDimension) {
        return service.save(physicalDimension);
    }

    @GetMapping
    public List<PhysicalDimension> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public PhysicalDimension getById(@PathVariable Long id) {
        Optional<PhysicalDimension> physicalDimensionOptional = service.getById(id);
        return physicalDimensionOptional.orElse(null); 
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody PhysicalDimension updatedPhysicalDimension) {
        service.update(id, updatedPhysicalDimension);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
