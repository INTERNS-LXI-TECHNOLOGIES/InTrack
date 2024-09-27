package com.divisosofttech.intrack.holisticlearningframework.service;

import com.divisosofttech.intrack.holisticlearningframework.entity.MentalDimention;
import com.divisosofttech.intrack.holisticlearningframework.repo.MentalDimentionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentalDimentionService {

    @Autowired
    private MentalDimentionRepository mentalDimentionRepository;

    // Get all Mental Dimensions
    public List<MentalDimention> getAllMentalDimentions() {
        return mentalDimentionRepository.findAll();
    }

    // Save a new Mental Dimension
    public void saveMentalDimention(MentalDimention mentalDimention) {
        mentalDimentionRepository.save(mentalDimention);
    }
}
