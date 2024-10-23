package com.divisosoft.mentaldimentional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.divisosoft.mentaldimentional.entity.CognitiveWorkshop;
import com.divisosoft.mentaldimentional.service.CognitiveWorkshopService;

import java.util.List;

@RestController
@RequestMapping("/api/workshops")
public class CognitiveWorkshopController {

    @Autowired
    private CognitiveWorkshopService workshopService;

    @GetMapping
    public List<CognitiveWorkshop> getAllWorkshops() {
        return workshopService.getAllWorkshops();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CognitiveWorkshop> getWorkshopById(@PathVariable Long id) {
        CognitiveWorkshop workshop = workshopService.getWorkshopById(id);
        return ResponseEntity.ok(workshop);
    }

    @PostMapping
    public CognitiveWorkshop createWorkshop(@RequestBody CognitiveWorkshop workshop) {
        return workshopService.createWorkshop(workshop);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CognitiveWorkshop> updateWorkshop(@PathVariable Long id,
            @RequestBody CognitiveWorkshop updatedWorkshop) {
        CognitiveWorkshop workshop = workshopService.updateWorkshop(id, updatedWorkshop);
        return ResponseEntity.ok(workshop);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkshop(@PathVariable Long id) {
        workshopService.deleteWorkshop(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllWorkshops() {
        workshopService.deleteAllWorkshops();
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/complete")
    public CognitiveWorkshop completeWorkshop(@PathVariable Long id) {
        return workshopService.completeWorkshop(id);
    }
}
