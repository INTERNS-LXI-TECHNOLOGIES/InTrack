package com.lxi.QuestionManagement.service;

import com.lxi.QuestionManagement.entity.*;
import com.lxi.QuestionManagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MentalDimensionService {

    @Autowired
    private MentalDimensionRepository repository;

    
    public List<MentalDimension> getAll() {
        return repository.findAll();
    }

    
    public MentalDimension save(MentalDimension mentalDimension) {
        return repository.save(mentalDimension);
    }

    
    public Optional<MentalDimension> getById(Long id) {
        return repository.findById(id);
    }

    
    public void update(Long id, MentalDimension updatedMentalDimension) {
        Optional<MentalDimension> existingMentalDimensionOptional = repository.findById(id);
        if (existingMentalDimensionOptional.isPresent()) {
            MentalDimension mentalDimension = existingMentalDimensionOptional.get();
        
            mentalDimension.setMultipleChoiceQuestion(updatedMentalDimension.getMultipleChoiceQuestion());
            mentalDimension.setOptions(updatedMentalDimension.getOptions());
            mentalDimension.setHackathonQuestion(updatedMentalDimension.getHackathonQuestion());
            mentalDimension.setLeetCodeQuestion(updatedMentalDimension.getLeetCodeQuestion());
            
           
            repository.save(mentalDimension);
        } else {
            throw new RuntimeException("Mental Dimension not found with id " + id);
        }
    }
    

    
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
