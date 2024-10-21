package com.lxi.internapp.service;




import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.stereotype.Service;
import com.lxi.internapp.entity.InternEnity;
import com.lxi.internapp.repository.InternRepository;

@Service
public class InternService {
    @Autowired
    InternRepository internRepository;

    public List<InternEnity> getAllResouInterns(){
    List<InternEnity>internList=new ArrayList<>();
    try{
        internList=internRepository.findAll();
    }
    catch(Exception e)
    {
        e.getMessage();
    }
    return internList;
}


public InternEnity create(InternEnity intern){
    return internRepository.save(intern);
}



public Optional<InternEnity> getId(Long id){
    return internRepository.findById(id);
}

public InternEnity updateIntern(Long id,InternEnity updateintern){
Optional<InternEnity> updateDetail=internRepository.findById(id);

if(updateDetail.isPresent()){
    InternEnity existintern = updateDetail.get();
    existintern.setName(updateintern.getName());
    existintern.setAge(updateintern.getAge());
    return internRepository.save(existintern);
}
else
return null;
}

public void deleteIntern(Long id){
Optional<InternEnity> deleteinter = internRepository.findById(id);

if(deleteinter.isPresent()){
    InternEnity existingIntern = deleteinter.get();
     internRepository.delete(existingIntern);
}
else
System.out.println("null");
}


}
