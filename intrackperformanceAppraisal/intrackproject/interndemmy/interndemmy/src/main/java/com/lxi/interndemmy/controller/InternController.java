
package com.lxi.interndemmy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxi.interndemmy.dto.InternHistoryDTO;
import com.lxi.interndemmy.model.Intern;
import com.lxi.interndemmy.service.InternService;

@RestController
@RequestMapping("/interns")
public class InternController {
    @Autowired
    private InternService internService;

    // POST: Create a new intern
    @PostMapping
    public ResponseEntity<Intern> createIntern(@RequestBody Intern intern) {
        Intern savedIntern = internService.saveIntern(intern);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedIntern);
    }

    // DELETE: Delete an intern by ID
@DeleteMapping("/{internId}")
public ResponseEntity<Void> deleteIntern(@PathVariable Long internId) {
    boolean isDeleted = internService.deleteInternById(internId);
    if (isDeleted) {
        return ResponseEntity.noContent().build();
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}

    

    // GET: Retrieve all interns
    @GetMapping
    public ResponseEntity<List<Intern>> getAllInterns() {
        List<Intern> interns = internService.findAllInterns();
        return ResponseEntity.ok(interns);
    }

    

    // GET: Retrieve an intern by ID
    @GetMapping("/{internId}")
    public ResponseEntity<Intern> getInternById(@PathVariable Long internId) {
        Optional<Intern> intern = internService.findById(internId);
        if (intern.isPresent()) {
            return ResponseEntity.ok(intern.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

@GetMapping("/{internId}/history")
    public ResponseEntity<InternHistoryDTO> getInternHistory(@PathVariable Long internId) {
        InternHistoryDTO history = internService.getInternHistory(internId);
        return ResponseEntity.ok(history);

}
}
