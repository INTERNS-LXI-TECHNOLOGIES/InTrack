package com.lxi.interndemmy.controller;

import com.lxi.interndemmy.dto.FeedbackDto;
import com.lxi.interndemmy.model.Feedback;
import com.lxi.interndemmy.model.Intern;
import com.lxi.interndemmy.service.FeedbackService;
import com.lxi.interndemmy.service.InternService; // Import InternService to retrieve intern details
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private InternService internService; // Service to fetch intern details

    // POST: Create feedback for a specific intern
   /*  @PostMapping
    public ResponseEntity<Feedback> createFeedback(@RequestBody Feedback feedback, @RequestParam Long internId) {
        Optional<Intern> internOptional = internService.findById(internId);
        
        // Check if the intern exists
        if (internOptional == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        
    
        Intern intern = internOptional.get();
        
        // Associate the feedback with the intern
        feedback.setIntern(intern);
        Feedback savedFeedback = FeedbackService.saveFeedback(feedback);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedFeedback);
    }  */



    @PostMapping
public ResponseEntity<List<Feedback>> createFeedbacks(@RequestBody List<Feedback> feedbackList, 
@RequestParam Long internId){
    
    Optional<Intern> internOptional = internService.findById(internId);
    
    // Check if the intern exists
    if (!internOptional.isPresent()) {  // Check using isPresent()
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    Intern intern = internOptional.get();
    List<Feedback> savedFeedbackList = new ArrayList<>();
    
    // Iterate through the feedback list and save each feedback
    for (Feedback feedback : feedbackList) {
        feedback.setIntern(intern); // Associate feedback with the intern
        Feedback savedFeedback = feedbackService.saveFeedback(feedback); // Save feedback
        savedFeedbackList.add(savedFeedback); // Add to saved list
    }
    
    return ResponseEntity.status(HttpStatus.CREATED).body(savedFeedbackList); // Return list of saved feedbacks
}

    // GET: Retrieve all feedbacks for a specific intern
   /* @GetMapping("/{internId}")
    public ResponseEntity<List<Feedback>> getAllFeedbackByInternId(@PathVariable Long internId) {
        List<Feedback> feedback = feedbackService.findAllByInternId(internId);
        
        // Check if the intern has any feedback records
        if (feedback.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(feedback);
        }
        
        return ResponseEntity.ok(feedback);
    }*/


     // GET: Retrieve feedbacks and average rating for a specific intern
     @GetMapping("/{internId}")
     public ResponseEntity<FeedbackDto> getFeedbackByInternId(@PathVariable Long internId) {
        FeedbackDto response = feedbackService.findFeedbackByInternId(internId);
         
         // Check if there are any feedback records
         if (response.getFeedbackList().isEmpty()) {
             return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
         }
 
         return ResponseEntity.ok(response);
     }
}
