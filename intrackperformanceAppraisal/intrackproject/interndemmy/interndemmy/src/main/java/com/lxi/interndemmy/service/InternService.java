
package com.lxi.interndemmy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.lxi.interndemmy.dto.AttendanceDto;
import com.lxi.interndemmy.dto.FeedbackDto;
import com.lxi.interndemmy.dto.InternHistoryDTO;
import com.lxi.interndemmy.dto.TaskCompletionDto;
import com.lxi.interndemmy.model.Attendance;
import com.lxi.interndemmy.model.Feedback;
import com.lxi.interndemmy.model.Intern;
import com.lxi.interndemmy.model.TaskCompletion;
import com.lxi.interndemmy.repository.InternRepository;

@Service
public class InternService {
    @Autowired
    private InternRepository internRepository;

    
    @Autowired
    private AttendanceService attendanceService; // Service for Attendance
    @Autowired
    private TaskCompletionService taskCompletionService; // Service for TaskCompletion
    @Autowired
    private FeedbackService feedbackService; // Service for Feedback

    // Method to save an intern
    public Intern saveIntern(Intern intern) {
        return internRepository.save(intern);
    }

    // Method to find all interns
    public List<Intern> findAllInterns() {
        return internRepository.findAll(); // Fetches all interns from the repository
    }

    // Method to find an intern by ID
    public Optional<Intern> findById(Long internId) {
        return internRepository.findById(internId); // Make sure your repository returns Optional
    }
    // DELETE: Delete an intern by ID
    public boolean deleteInternById(Long internId) {
        Optional<Intern> intern = internRepository.findById(internId);
        if (intern.isPresent()) {
            internRepository.deleteById(internId);
            return true;
        } else {
            return false;
        }
    }

    

    public InternHistoryDTO getInternHistory(Long internId) {
        Intern intern = internRepository.findById(internId)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND, "Intern not found"));
        AttendanceDto attendanceRecords = attendanceService.findAttendanceByInternId(internId);
        TaskCompletionDto taskCompletions = taskCompletionService.findTaskCompletionByInternId(internId);
        FeedbackDto feedbacks = feedbackService.findFeedbackByInternId(internId);

        InternHistoryDTO performanceDTO = new InternHistoryDTO();
        performanceDTO.setIntern(intern);
        performanceDTO.setAttendanceRecords(attendanceRecords);
        performanceDTO.setTaskCompletions(taskCompletions);
        performanceDTO.setFeedbacks(feedbacks);

        return performanceDTO;
    }
    

}
