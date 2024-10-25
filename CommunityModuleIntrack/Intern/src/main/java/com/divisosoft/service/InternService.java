package com.divisosoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisosoft.model.Intern;
import com.divisosoft.repository.InternRepository;

@Service
public class InternService {

@Autowired
private InternRepository internRepository;

public void createIntern(Intern intern){
    internRepository.save(intern);
}
public List<Intern> getIntern(){
    return internRepository.findAll();
}

public void updateIntern(Long id,Intern intern){
    Intern intern2=internRepository.findById(id).orElse(intern);
    intern2.setName(intern.getName());
    intern2.setPerformanceScore(intern.getPerformanceScore());
    intern2.setTaskProgress(intern.getTaskProgress());
    internRepository.save(intern);
}

public void deleteIntern(Long id){
    internRepository.deleteById(id);
}

}
