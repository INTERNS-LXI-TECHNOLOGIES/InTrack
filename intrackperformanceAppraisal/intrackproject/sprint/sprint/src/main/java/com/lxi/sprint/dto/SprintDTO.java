    package com.lxi.sprint.dto;

import java.time.LocalDate;
import java.util.List;

import org.openapitools.client.model.Attendance;
import org.openapitools.client.model.AttendanceDto;
import org.openapitools.client.model.Feedback;
import org.openapitools.client.model.FeedbackDto;
import org.openapitools.client.model.TaskCompletion;
import org.openapitools.client.model.TaskCompletionDto;

public class SprintDTO {

    private int sprintNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long internId;
    private String name;
    

    private AttendanceDto attendanceRecords;
    private TaskCompletionDto taskCompletions;
    private FeedbackDto feedbacks;


    // Getters and Setters

    public int getSprintNumber() {
        return sprintNumber;
    }

    public void setSprintNumber(int sprintNumber) {
        this.sprintNumber = sprintNumber;
    }

    public Long getInternId() {
        return internId;
    }

    public void setInternId(Long internId) {
        this.internId = internId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    

    

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public AttendanceDto getAttendanceRecords() {
        return attendanceRecords;
    }

    public void setAttendanceRecords(AttendanceDto attendanceRecords) {
        this.attendanceRecords = attendanceRecords;
    }

    public FeedbackDto getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(FeedbackDto feedbacks) {
        this.feedbacks = feedbacks;
    }

    public TaskCompletionDto getTaskCompletions() {
        return taskCompletions;
    }

    public void setTaskCompletions(TaskCompletionDto taskCompletions) {
        this.taskCompletions = taskCompletions;
    }
}
