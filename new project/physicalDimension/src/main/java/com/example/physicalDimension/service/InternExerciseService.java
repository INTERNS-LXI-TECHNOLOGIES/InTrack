package com.example.physicalDimension.service;

import java.util.List;
import java.util.Optional;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.InternControllerApi;
import org.openapitools.client.model.Intern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.physicalDimension.model.InternExercise;
import com.example.physicalDimension.repository.InternExerciseRepository;
@Service
public class InternExerciseService {
  @Autowired
  private InternExerciseRepository internExerciseRepository;

  public List<InternExercise> getAllAssignedExercises() {
    return internExerciseRepository.findAll();
}

public List<Intern> getAllInternsApi() throws ApiException{
  ApiClient apiClient=new ApiClient();
  apiClient.setBasePath("http://localhost:8081");
  InternControllerApi internControllerApi = new InternControllerApi(apiClient);
  List<Intern> servInterns = internControllerApi.getAllIntern();
  return servInterns;
}


public InternExercise assignExerciseToIntern(InternExercise internExercise) {
  return internExerciseRepository.save(internExercise);
}


public InternExercise updateInternExercise(Long id, InternExercise updatedInternExercise) {
  Optional<InternExercise> existingInternExerciseOpt = internExerciseRepository.findById(id);

  if (existingInternExerciseOpt.isPresent()) {
      InternExercise existingInternExercise = existingInternExerciseOpt.get();

      existingInternExercise.setStatus(updatedInternExercise.getStatus());
      existingInternExercise.setDateAssigned(updatedInternExercise.getDateAssigned());
      existingInternExercise.setDateCompleted(updatedInternExercise.getDateCompleted());

      return internExerciseRepository.save(existingInternExercise);
  } else {
      throw new RuntimeException("InternExercise not found with id: " + id);
  }
}

public void deleteAssignment(Long id) {
  internExerciseRepository.deleteById(id);
}
  
}
