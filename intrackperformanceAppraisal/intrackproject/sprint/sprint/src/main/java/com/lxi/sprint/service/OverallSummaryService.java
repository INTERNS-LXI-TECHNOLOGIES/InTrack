package com.lxi.sprint.service;


import com.lxi.sprint.model.OverallSummaryEntity;
import com.lxi.sprint.repository.OverallSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OverallSummaryService {

    private final OverallSummaryRepository overallSummaryRepository;

    @Autowired
    public OverallSummaryService(OverallSummaryRepository overallSummaryRepository) {
        this.overallSummaryRepository = overallSummaryRepository;
    }

    public OverallSummaryEntity saveOverallSummary(OverallSummaryEntity overallSummary) {
        OverallSummaryEntity entity = new OverallSummaryEntity();
        entity.setInternId(overallSummary.getInternId());
        entity.setPerformanceRating(overallSummary.getPerformanceRating());
        entity.setStrengths(overallSummary.getStrengths());
        entity.setAreasForImprovement(overallSummary.getAreasForImprovement());
        entity.setRecommendations(overallSummary.getRecommendations());

        return overallSummaryRepository.save(entity);
    }

    public Optional<OverallSummaryEntity> getOverallSummaryByInternId(Long internId) {
        return overallSummaryRepository.findById(internId);
    }
}
