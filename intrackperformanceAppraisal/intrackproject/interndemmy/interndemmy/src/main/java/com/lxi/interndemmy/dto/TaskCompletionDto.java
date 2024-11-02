package com.lxi.interndemmy.dto;
 import com.lxi.interndemmy.model.TaskCompletion;
 import java.util.List;


 public class TaskCompletionDto{

     private List<TaskCompletion> TaskCompletionList;
     private double completionPercentage;

    public TaskCompletionDto(List<TaskCompletion> TaskCompletionList, double completionPercentage) {
        this.TaskCompletionList = TaskCompletionList;
        this.completionPercentage = completionPercentage;
    }

    public List<TaskCompletion> getTaskCompletionList() {
        return TaskCompletionList;
    }

    public void setTaskCompletionList(List<TaskCompletion> TaskCompletionList) {
        this.TaskCompletionList = TaskCompletionList;
    }

    public double getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(double completionPercentage) {
        this.completionPercentage = completionPercentage;
    }





 }