package com.divisosoft.internproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.divisosoft.internproject.entity.Intern;
import com.divisosoft.internproject.service.InternService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/interns")
public class InternController {

    @Autowired
    private InternService internService;

  //  @PostMapping
   // public ResponseEntity<Intern> createIntern(@RequestBody Intern intern) {
      //  return ResponseEntity.ok(internService.createIntern(intern));
   // }

    @GetMapping
    public List<org.openapitools.client.model.Intern> getAInterns(){
        return internService.getAllResources();
    }

    // Read a single intern by ID
    @GetMapping("/{id}")
    public ResponseEntity<Intern> getInternById(@PathVariable Long id) {
        Optional<Intern> intern = internService.getInternById(id);
        return intern.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update an intern
    @PutMapping("/{id}")
    public ResponseEntity<Intern> updateIntern(@PathVariable Long id, @RequestBody Intern updatedIntern) {
        Intern updated = internService.updateIntern(id, updatedIntern);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIntern(@PathVariable Long id) {
        internService.deleteIntern(id);
        return ResponseEntity.noContent().build();
    }
}
