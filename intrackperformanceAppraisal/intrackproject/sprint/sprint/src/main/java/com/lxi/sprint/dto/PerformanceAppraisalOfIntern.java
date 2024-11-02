package com.lxi.sprint.dto;

import com.lxi.sprint.model.OverallSummaryEntity;

public class PerformanceAppraisalOfIntern {

    // Unique identifier for the appraisal
    private SprintDTO internHistory; // Details of the intern's sprint history
    private OverallSummaryEntity overallSummary; // Overall summary of the intern's performance

    // Getter and Setter for id
   

    // Getter and Setter for internHistory
    public SprintDTO getInternHistory() {
        return internHistory;
    }

    public void setInternHistory(SprintDTO internHistory) {
        this.internHistory = internHistory;
    }

    // Getter and Setter for overallSummary
    public OverallSummaryEntity getOverallSummary() {
        return overallSummary;
    }

    public void setOverallSummary(OverallSummaryEntity overallSummary) {
        this.overallSummary = overallSummary;
    }
}
