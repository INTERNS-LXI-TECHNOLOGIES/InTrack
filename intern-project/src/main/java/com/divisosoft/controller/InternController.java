package com.divisosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.divisosoft.models.Intern;
import com.divisosoft.service.InternService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/internss")
public class InternController {

    @Autowired
    private InternService internService;

    @GetMapping
    public List<Intern> getAllInterns() {
        return internService.getAllInterns();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Intern> getInternById(@PathVariable Long id) {
        Optional<Intern> intern = internService.getInternById(id);
        return intern.map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Intern> createIntern(@RequestBody Intern intern) {
        Intern savedIntern = internService.createIntern(intern);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedIntern);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Intern> updateIntern(@PathVariable Long id, @RequestBody Intern updatedIntern) {
        return internService.updateIntern(id, updatedIntern)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIntern(@PathVariable Long id) {
        if (internService.deleteIntern(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
