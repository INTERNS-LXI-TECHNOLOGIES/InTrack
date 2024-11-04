package com.lxi.QuestionManagement.service;

import com.lxi.QuestionManagement.entity.*;
import com.lxi.QuestionManagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhysicalDimensionService {
    
    @Autowired
    private PhysicalDimensionRepository repository;

    public List<PhysicalDimension> getAll() {
        return repository.findAll();
    }

    public PhysicalDimension save(PhysicalDimension physicalDimension) {
        return repository.save(physicalDimension);
    }

    public Optional<PhysicalDimension> getById(Long id) {
        return repository.findById(id);
    }

    public void update(Long id, PhysicalDimension updatedPhysicalDimension) {
        Optional<PhysicalDimension> existingPhysicalDimensionOptional = repository.findById(id);
        if (existingPhysicalDimensionOptional.isPresent()) {
            PhysicalDimension physicalDimension = existingPhysicalDimensionOptional.get();
            physicalDimension.setYesNoQuestion(updatedPhysicalDimension.getYesNoQuestion());
            physicalDimension.setExerciseTasks(updatedPhysicalDimension.getExerciseTasks());
    
            repository.save(physicalDimension);
        } else {
            throw new RuntimeException("Physical Dimension not found with id " + id);
        }
    }
    

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
