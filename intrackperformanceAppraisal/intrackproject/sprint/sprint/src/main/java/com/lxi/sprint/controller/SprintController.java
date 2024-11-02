package com.lxi.sprint.controller;

import java.util.List;
import java.util.Optional;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Attendance;
import org.openapitools.client.model.Feedback;
import org.openapitools.client.model.Intern;
import org.openapitools.client.model.InternHistoryDTO;
import org.openapitools.client.model.TaskCompletion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lxi.sprint.model.Sprint;
import com.lxi.sprint.dto.PerformanceAppraisalOfIntern;
import com.lxi.sprint.dto.SprintDTO;
import com.lxi.sprint.service.SprintService;

@RestController
@RequestMapping("/sprints")
public class SprintController {

    @Autowired
    private SprintService sprintService;
    

    @GetMapping
    public List<Sprint> getAllSprints() {
        return sprintService.getAllSprints();

    }
    



    @GetMapping("/{sprintNumber}/details/{internId}") 
    public SprintDTO getSprintDetails(@PathVariable int sprintNumber, @PathVariable Long internId) throws ApiException {
        return sprintService.getSprintDetails(sprintNumber, internId);
    }
    

    @GetMapping("/{sprintNumber}/AppraisalPerformanceOfIntern/{internId}")
    public PerformanceAppraisalOfIntern getPerformanceAppraisal(@PathVariable int sprintNumber, @PathVariable Long internId) throws ApiException {
        return sprintService.getPerformanceAppraisalById(sprintNumber, internId);

    }
   /* 
   
   @GetMapping("/{id}/attendance/{internId}")
    public List<Attendance> getAttendanceById(@PathVariable Long internId)throws ApiException{

        return sprintService.getAllattendence(internId);
    } */

   /*  @GetMapping("/{id}/feedback/{internId}")
    public List<Feedback> getFeedbackById(@PathVariable Long internId)throws ApiException{

        return sprintService.getAllFeedback(internId);
    }


    @GetMapping("/{id}/taskcompletion/{internId}")
    public List<TaskCompletion> getTaskById(@PathVariable Long internId)throws ApiException{

        return sprintService.getAllTask(internId);
    }*/

    @GetMapping("/{id}/intern/{internId}")
public Intern getInternById(@PathVariable Long internId) throws ApiException {
    return sprintService.getAllIntern(internId);
}
@GetMapping("/{id}/history/{internId}")
public InternHistoryDTO getInternHistory(@PathVariable Long internId) throws ApiException {
    return sprintService.getAllInternHistory(internId);
}



    @GetMapping("/{id}")
    public Optional<Sprint> getSprintById(@PathVariable Long id) {
        return sprintService.getSprintById(id);
    }

    @PostMapping
    public Sprint createSprint(@RequestBody Sprint sprint) {
        return sprintService.saveSprint(sprint);
    }

    @DeleteMapping("/{id}")
    public void deleteSprint(@PathVariable Long id) {
        sprintService.deleteSprint(id);
    }
}
