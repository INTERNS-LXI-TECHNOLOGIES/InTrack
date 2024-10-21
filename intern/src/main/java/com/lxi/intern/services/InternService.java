package com.lxi.intern.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxi.intern.models.Intern;
import com.lxi.intern.repositories.InternRepository;

@Service
public class InternService {

  @Autowired
  private InternRepository internRepository;

  public void saveIntern(Intern intern) {
    internRepository.save(intern);
  }

  public List<Intern> getAllInterns() {
    return internRepository.findAll();
  }

  public Optional<Intern> getInternById(Long id) {
    return internRepository.findById(id);
}

  public void updateIntern(Long id,Intern updatedIntern)  {
    
    Optional<Intern> existingInternOptional = internRepository.findById(id);

    if(existingInternOptional.isPresent()){
      Intern existingIntern = existingInternOptional.get();

      existingIntern.setName(updatedIntern.getName());
      existingIntern.setAge(updatedIntern.getAge());

      internRepository.save(existingIntern);
    }

    else {
      
      throw new RuntimeException("Intern with ID " + id + " not found.");
    }
  }

  public void deleteIntern(Long id){
    Optional<Intern> deletedIntern = internRepository.findById(id);
    if(deletedIntern.isPresent()){
    Intern deleIntern = deletedIntern.get();

    internRepository.delete(deleIntern);
  }
  else {
    throw new RuntimeException("Intern with ID " + id + " not found.");
  }

  }
}
