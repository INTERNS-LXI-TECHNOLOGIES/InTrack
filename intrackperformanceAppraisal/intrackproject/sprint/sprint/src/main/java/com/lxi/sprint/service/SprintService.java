/*

@Service
public class SprintService {

    
    

    @Autowired
    private SprintRepository sprintRepository;

    @Autowired
    private InternRepository internRepository;

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private TaskCompletionRepository taskCompletionRepository;

    @Autowired
    private FeedbackRepository feedbackRepository;

    public SprintDTO getSprintDetails(int sprintNumber, Long internId) {
        Optional<Sprint> sprintOptional = sprintRepository.findBySprintNumber(sprintNumber);
        if (sprintOptional.isPresent()) {
            Sprint sprint = sprintOptional.get();
            SprintDTO sprintDTO = new SprintDTO();
            sprintDTO.setSprintNumber(sprint.getSprintNumber());
            sprintDTO.setInternId(internId);

            // Assuming the intern's name is fetched from the Intern repository
            Intern intern = internRepository.findById(internId).orElse(null);
            if (intern != null) {
                sprintDTO.setName(intern.getName());
            }

            List<Attendance> attendanceRecords = attendanceRepository.findByInternId(internId);
            List<TaskCompletion> taskCompletions = taskCompletionRepository.findByInternId(internId);
            List<Feedback> feedbacks = feedbackRepository.findByInternId(internId);

            sprintDTO.setAttendanceRecords(attendanceRecords);
            sprintDTO.setTaskCompletions(taskCompletions);
            sprintDTO.setFeedbacks(feedbacks);

            return sprintDTO;
        }
        return null; // Or throw an exception
    }
   
   
   
   
   
    public List <Sprint> getAllSprints() {
        return sprintRepository.findAll();
    }/* */

    package com.lxi.sprint.service;

    import java.util.List;
    import java.util.Optional;
    
    import org.openapitools.client.ApiClient;
    import org.openapitools.client.ApiException;
    import org.openapitools.client.api.AttendanceControllerApi;
    import org.openapitools.client.api.FeedbackControllerApi;
    import org.openapitools.client.api.InternControllerApi;
    import org.openapitools.client.api.TaskCompletionControllerApi;
    import org.openapitools.client.model.Attendance;
import org.openapitools.client.model.AttendanceDto;
import org.openapitools.client.model.Feedback;
import org.openapitools.client.model.FeedbackDto;
    import org.openapitools.client.model.Intern;
    import org.openapitools.client.model.InternHistoryDTO;
    import org.openapitools.client.model.TaskCompletion;
import org.openapitools.client.model.TaskCompletionDto;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

import com.lxi.sprint.dto.PerformanceAppraisalOfIntern;
import com.lxi.sprint.dto.SprintDTO;
import com.lxi.sprint.model.OverallSummaryEntity;
import com.lxi.sprint.model.Sprint;
import com.lxi.sprint.repository.OverallSummaryRepository;
import com.lxi.sprint.repository.SprintRepository;
    
    @Service
    public class SprintService {
    
        @Autowired
        private SprintRepository sprintRepository;
        @Autowired
    private OverallSummaryRepository overallSummaryRepository;
    
        // External API Clients
            
        public SprintDTO getSprintDetails(int sprintNumber, Long internId) throws ApiException {
            Optional<Sprint> sprintOptional = sprintRepository.findBySprintNumber(sprintNumber);
            System.out.println(sprintOptional);
            if (sprintOptional.isPresent()) {
                Sprint sprint = sprintOptional.get();
                SprintDTO sprintDTO = new SprintDTO();
                sprintDTO.setSprintNumber(sprint.getSprintNumber());
                sprintDTO.setStartDate(sprint.getStartDate());
                sprintDTO.setEndDate(sprint.getEndDate());
                sprintDTO.setInternId(internId);
                ApiClient apiClient = new ApiClient();
                apiClient.setBasePath("http://localhost:8081");
                final InternControllerApi internControllerApi = new InternControllerApi(apiClient);
                // Fetch intern details from the external API
                Intern intern = internControllerApi.getInternById(internId);
                if (intern != null) {
                    sprintDTO.setName(intern.getName());
                }
                
                // Fetch attendance, feedback, and task completion records from external APIs
                 final AttendanceControllerApi attendanceControllerApi = new AttendanceControllerApi(apiClient);
                 final FeedbackControllerApi feedbackControllerApi = new FeedbackControllerApi(apiClient);
     final TaskCompletionControllerApi taskCompletionControllerApi = new TaskCompletionControllerApi(apiClient);
         
                AttendanceDto attendanceRecords = attendanceControllerApi.getAttendanceByInternId(internId);
                TaskCompletionDto taskCompletions = taskCompletionControllerApi.getTaskCompletionByInternId(internId);
                FeedbackDto feedbacks = feedbackControllerApi.getFeedbackByInternId(internId);
    
                sprintDTO.setAttendanceRecords(attendanceRecords);
                sprintDTO.setTaskCompletions(taskCompletions);
                sprintDTO.setFeedbacks(feedbacks);
    
                return sprintDTO;
            }
            return null; // Or throw an exception if sprint not found
        }
    
        public List<Sprint> getAllSprints() {
            return sprintRepository.findAll();
        }
    
        // Other methods remain the same...
    
    
    /*public List<Attendance> getAllattendence(Long internId)throws ApiException{

        ApiClient apiClient =new ApiClient();
        apiClient.setBasePath("http://localhost:8081");

        AttendanceControllerApi attendanceControllApi=new AttendanceControllerApi(apiClient);

        List<Attendance>  serverAttandnce = attendanceControllApi.getAllAttendancesByInternId(internId);
       return serverAttandnce;
    }/* 

    /*public List<Feedback> getAllFeedback(Long internId)throws ApiException{
        ApiClient apiClient =new ApiClient();
        apiClient.setBasePath("http://localhost:8081");

        FeedbackControllerApi feedbackcontrollerApi =new FeedbackControllerApi(apiClient);
        List<Feedback> serverFeedback =feedbackcontrollerApi.getAllFeedbackByInternId(internId);

        return serverFeedback;
    }*/

   /* public List<TaskCompletion> getAllTask(Long internId)throws ApiException{
        ApiClient apiClient =new ApiClient();
        apiClient.setBasePath("http://localhost:8081");

        TaskCompletionControllerApi taskcontrollerApi =new TaskCompletionControllerApi(apiClient);
        List<TaskCompletion> serverTask =taskcontrollerApi.getAllTaskCompletionByInternId(internId);

        return serverTask;
    }*/ 

    public Intern getAllIntern(Long internId)throws ApiException{
        ApiClient apiClient =new ApiClient();
        apiClient.setBasePath("http://localhost:8081");

        InternControllerApi interncontrollerApi =new InternControllerApi(apiClient);
         Intern intern =interncontrollerApi.getInternById(internId);

        return intern;
    }

    public InternHistoryDTO getAllInternHistory(Long internId)throws ApiException{
        ApiClient apiClient =new ApiClient();
        apiClient.setBasePath("http://localhost:8081");

        InternControllerApi interncontrollerApi =new InternControllerApi(apiClient);
        InternHistoryDTO intern =interncontrollerApi.getInternHistory(internId);

        return intern;
    }

    public Optional<Sprint> getSprintById(Long id) {
        return sprintRepository.findById(id);
    }

    public Sprint saveSprint(Sprint sprint) {
        return sprintRepository.save(sprint);
    }

    public void deleteSprint(Long id) {
        sprintRepository.deleteById(id);
    }

    public PerformanceAppraisalOfIntern getPerformanceAppraisalById(int sprintNumber, Long internId) throws ApiException {
        Optional<Sprint> sprintOptional = sprintRepository.findBySprintNumber(sprintNumber);
        System.out.println(sprintOptional);
    
        if (sprintOptional.isPresent()) {
            Sprint sprint = sprintOptional.get();
            SprintDTO sprintDTO = new SprintDTO();
            sprintDTO.setSprintNumber(sprint.getSprintNumber());
            sprintDTO.setStartDate(sprint.getStartDate());
            sprintDTO.setEndDate(sprint.getEndDate());
            sprintDTO.setInternId(internId);
            
            ApiClient apiClient = new ApiClient();
            apiClient.setBasePath("http://localhost:8081");
            final InternControllerApi internControllerApi = new InternControllerApi(apiClient);
    
            // Fetch intern details from the external API
            Intern intern = internControllerApi.getInternById(internId);
            if (intern != null) {
                sprintDTO.setName(intern.getName());
            }
            
            // Fetch attendance, feedback, and task completion records from external APIs
            final AttendanceControllerApi attendanceControllerApi = new AttendanceControllerApi(apiClient);
            final FeedbackControllerApi feedbackControllerApi = new FeedbackControllerApi(apiClient);
            final TaskCompletionControllerApi taskCompletionControllerApi = new TaskCompletionControllerApi(apiClient);
            
            AttendanceDto attendanceRecords = attendanceControllerApi.getAttendanceByInternId(internId);
            TaskCompletionDto taskCompletions = taskCompletionControllerApi.getTaskCompletionByInternId(internId);
            FeedbackDto feedbacks = feedbackControllerApi.getFeedbackByInternId(internId);
            
            sprintDTO.setAttendanceRecords(attendanceRecords);
            sprintDTO.setTaskCompletions(taskCompletions);
            sprintDTO.setFeedbacks(feedbacks);
            
            // Retrieve overall summary by internId
            Optional<OverallSummaryEntity> overallSummaryOpt = overallSummaryRepository.findById(internId);
            
            // Create and return the performance appraisal if both records are found
            if (overallSummaryOpt.isPresent()) {
                PerformanceAppraisalOfIntern appraisal = new PerformanceAppraisalOfIntern();
                appraisal.setOverallSummary(overallSummaryOpt.get());
                appraisal.setInternHistory(sprintDTO); // Set the intern's sprint history
                if (appraisal == null) {
                    throw new ApiException("Appraisal not found for intern " + internId + " in sprint " + sprintNumber);
                }
                return appraisal; // Return the combined object
            } 
        }
    
        return null; // Return null if no data found
    }
    
}
