package com.lxi.interndemmy.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lxi.interndemmy.dto.TaskCompletionDto;
import com.lxi.interndemmy.model.Intern;
import com.lxi.interndemmy.model.TaskCompletion;
import com.lxi.interndemmy.service.InternService;
import com.lxi.interndemmy.service.TaskCompletionService;

@RestController
@RequestMapping("/task")
public class TaskCompletionController {
    @Autowired
    private TaskCompletionService taskCompletionService;
    @Autowired
    private InternService internService;

    @PostMapping
    public ResponseEntity<TaskCompletion> createtaskcompltion(@RequestBody TaskCompletion taskcompletion, @RequestParam Long internId) {
        Optional<Intern> internOptional = internService.findById(internId);
        
        // Check if the intern exists
        if (internOptional == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        
    
        Intern intern = internOptional.get();
        
        // Associate the attendance with the intern
        taskcompletion.setIntern(intern);
        TaskCompletion savedTaskCompletion = taskCompletionService.saveTaskCompletion(taskcompletion);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTaskCompletion);
    }


   /*  @GetMapping("/{internId}")
    public ResponseEntity<List<TaskCompletion>> getAllTaskCompletionByInternId(@PathVariable Long internId) {
        List<TaskCompletion> TaskCompletionList = taskCompletionService.findAllByInternId(internId);
        
        // Check if the intern has any attendance records
        if (TaskCompletionList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(TaskCompletionList);
        }
        
        return ResponseEntity.ok(TaskCompletionList);
    }*/

@GetMapping("{internId}")
public ResponseEntity<TaskCompletionDto> getTaskCompletionByInternId(@PathVariable Long internId){


TaskCompletionDto response=taskCompletionService.findTaskCompletionByInternId(internId);

if(response.getTaskCompletionList().isEmpty()){
return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
}

return ResponseEntity.ok(response);

}



}



