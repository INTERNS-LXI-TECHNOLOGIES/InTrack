package com.lxi.interndemmy.service;



import com.lxi.interndemmy.model.TaskCompletion;
import com.lxi.interndemmy.repository.TaskCompletionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.lxi.interndemmy.dto.TaskCompletionDto;

@Service
public class TaskCompletionService {
    @Autowired
    private TaskCompletionRepository taskCompletionRepository;

    public TaskCompletion saveTaskCompletion(TaskCompletion taskCompletion) {
        return taskCompletionRepository.save(taskCompletion);
    }

    public List<TaskCompletion> getAllTaskCompletions() {
        return taskCompletionRepository.findAll();
    }

    public List<TaskCompletion> findAllByInternId(Long internId) {
        return taskCompletionRepository.findByInternId(internId);
    }
     //Combined method to get task completions and completion percentage

    public TaskCompletionDto findTaskCompletionByInternId(Long internId){
       
        List<TaskCompletion> taskCompletioList=taskCompletionRepository.findByInternId(internId);

        // Calculate completion percentag
           double completionPercentage=0.0;
           if(!taskCompletioList.isEmpty()){
            
            int totalTasks =taskCompletioList.size();
            int CompletedTask= (int) taskCompletioList.stream().filter(TaskCompletion::getCompleted).count();
            completionPercentage=(double) CompletedTask/totalTasks *100;// Return percentage
        }

         return new TaskCompletionDto(taskCompletioList,completionPercentage);
           
        
        }

        
}



    
    

