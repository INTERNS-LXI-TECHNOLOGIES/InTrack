package com.example.physicalDimension.controller;

import java.util.List;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Intern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.physicalDimension.model.InternExercise;
import com.example.physicalDimension.service.InternExerciseService;

@RestController
@RequestMapping("/intern-exercises")
public class InternExerciseController {

    @Autowired
    private InternExerciseService internExerciseService;

    @GetMapping
    public List<InternExercise> getAllInternExercises() {
        return internExerciseService.getAllAssignedExercises();
    }

    @GetMapping("/intern-ex")
    public List<Intern> getAllInterns() throws ApiException{
        return internExerciseService.getAllInternsApi();
    }

    @PostMapping
    public void saveInternExercise(@RequestBody InternExercise internExercise) {
        internExerciseService.assignExerciseToIntern(internExercise);
    }

    @PutMapping("/{id}")
    public void updateInternExercise(@PathVariable Long id, @RequestBody InternExercise internExercise) {
        internExerciseService.updateInternExercise(id, internExercise);
    }

    @DeleteMapping("/{id}")
    public void deleteInternExercise(@PathVariable Long id) {
        internExerciseService.deleteAssignment(id);
    }
}
