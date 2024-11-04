package com.lxi.QuestionManagement.service;

import com.lxi.QuestionManagement.entity.SocialDimension;
import com.lxi.QuestionManagement.repository.SocialDimensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocialDimensionService {

    @Autowired
    private SocialDimensionRepository repository;

    public List<SocialDimension> getAll() {
        return repository.findAll();
    }

    public SocialDimension save(SocialDimension socialDimension) {
        return repository.save(socialDimension);
    }

    public Optional<SocialDimension> getById(Long id) {
        return repository.findById(id);
    }

    public void update(Long id, SocialDimension updatedSocialDimension) {
        Optional<SocialDimension> existingSocialDimensionOptional = repository.findById(id);
        if (existingSocialDimensionOptional.isPresent()) {
            SocialDimension socialDimension = existingSocialDimensionOptional.get();
            socialDimension.setTask(updatedSocialDimension.getTask());
            socialDimension.setIsCompleted(updatedSocialDimension.getIsCompleted()); 
            repository.save(socialDimension);
        } else {
            throw new RuntimeException("Social Dimension not found with id " + id);
        }
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
