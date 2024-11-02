package com.lxi.interndemmy.dto;


import com.lxi.interndemmy.model.Intern;


public class InternHistoryDTO {
    private Intern intern;
     //Assuming you have this in your Intern entity
    private AttendanceDto attendanceRecords;
    private TaskCompletionDto taskCompletions;
    private FeedbackDto feedbacks;

    // Constructors, Getters, and Setters

    public Intern getIntern() {
        return intern;
    }

    public void setIntern(Intern intern) {
        this.intern = intern;
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
