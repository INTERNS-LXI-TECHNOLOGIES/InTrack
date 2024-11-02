package com.lxi.interndemmy.service;


import com.lxi.interndemmy.model.Feedback;
import com.lxi.interndemmy.repository.FeedbackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.lxi.interndemmy.dto.FeedbackDto;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    public List<Feedback> findAllByInternId(Long internId) {
        return feedbackRepository.findByInternId(internId);
    }
    public FeedbackDto findFeedbackByInternId(Long internId) {
        List<Feedback> feedbackList = feedbackRepository.findByInternId(internId);

        // Calculate average rating
        double averageRating = 0.0;

        if (!feedbackList.isEmpty()) {
            double totalRating = feedbackList.stream().mapToInt(Feedback::getRating).sum();
            averageRating = totalRating / feedbackList.size(); // Return average rating
        }

        // Return the response object containing both feedbacks and average rating
        return new FeedbackDto(feedbackList, averageRating);
    }
    
}
