package com.lxi.interndemmy.dto;

import com.lxi.interndemmy.model.Feedback;

import java.util.List;

public class FeedbackDto {
    private List<Feedback> feedbackList;
    private double averageRating;

    public FeedbackDto(List<Feedback> feedbackList, double averageRating) {
        this.feedbackList = feedbackList;
        this.averageRating = averageRating;
    }

    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}
