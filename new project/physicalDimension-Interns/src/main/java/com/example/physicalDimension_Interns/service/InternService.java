package com.example.physicalDimension_Interns.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.physicalDimension_Interns.model.Intern;
import com.example.physicalDimension_Interns.repository.InternRepository;

@Service
public class InternService {
  @Autowired
  private InternRepository internRepository;

  public List<Intern> getAllInterns(){
    return internRepository.findAll();
  }

  public Intern assignIntern(Intern intern){
    return internRepository.save(intern);
  }

  public Intern updateIntern(Long id,Intern updatedIntern){
    Optional<Intern> existingInternOpt = internRepository.findById(id);

    if (existingInternOpt.isPresent()){
      Intern existingIntern = existingInternOpt.get();

      existingIntern.setEmail(updatedIntern.getEmail());
      existingIntern.setName(updatedIntern.getName());
      existingIntern.setLevel(updatedIntern.getLevel());
      existingIntern.setJoinDate(updatedIntern.getJoinDate());

      return internRepository.save(updatedIntern);

    }else {
      throw new RuntimeException("InternExercise not found with id: " + id);
  }
  }

  public void deleteIntern(Long id) {
    internRepository.deleteById(id);
  }
  
}
