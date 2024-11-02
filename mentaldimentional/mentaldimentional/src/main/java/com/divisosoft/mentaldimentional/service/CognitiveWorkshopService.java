package com.divisosoft.mentaldimentional.service;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.CognitiveWorkshopControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.mentaldimentional.entity.CognitiveWorkshop;
import com.divisosoft.mentaldimentional.repository.CognitiveWorkshopRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CognitiveWorkshopService {

    @Autowired
    private CognitiveWorkshopRepository workshopRepository;

    // Retrieve all workshops
    public List<CognitiveWorkshop> getAllWorkshops() {
        return workshopRepository.findAll();
    }

    // Retrieve a workshop by ID
    public CognitiveWorkshop getWorkshopById(Long id) {
        return workshopRepository.findById(id).orElseThrow(() -> new RuntimeException("Workshop not found"));
    }

    // Create a new workshop
    public CognitiveWorkshop createWorkshop(CognitiveWorkshop workshop) {
        return workshopRepository.save(workshop);
    }

    // Update an existing workshop
    public CognitiveWorkshop updateWorkshop(Long id, CognitiveWorkshop updatedWorkshop) {
        CognitiveWorkshop existingWorkshop = getWorkshopById(id);
        existingWorkshop.setTitle(updatedWorkshop.getTitle());
        existingWorkshop.setDescription(updatedWorkshop.getDescription());
        existingWorkshop.setCompleted(updatedWorkshop.isCompleted());
        return workshopRepository.save(existingWorkshop);
    }

    // Delete a workshop by ID
    public void deleteWorkshop(Long id) {
        CognitiveWorkshop workshop = getWorkshopById(id);
        workshopRepository.delete(workshop);
    }

    // Delete all workshops
    public void deleteAllWorkshops() {
        workshopRepository.deleteAll();
    }

    // Mark a workshop as completed
    public CognitiveWorkshop completeWorkshop(Long id) {
        CognitiveWorkshop workshop = getWorkshopById(id);
        workshop.setCompleted(true);
        return workshopRepository.save(workshop);
    }
}
