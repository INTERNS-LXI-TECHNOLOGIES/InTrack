package com.lxi.intern;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;


@Service
public class InternService
{
@Autowired
private InternRepository internRepository;

public void create(Intern intern){

internRepository.save(intern);
}

public List<Intern>  getIntern(){

   return internRepository.findAll();

}

public  Intern updateIntern(Long id,Intern detailIntern){

Optional <Intern> optionalIntern=internRepository.findById(id);

if(optionalIntern .isPresent())
{

   Intern intern =optionalIntern.get();

   intern.setName(detailIntern.getName());
   intern.setAge(detailIntern.getAge());
   intern.setEmail(detailIntern.getEmail());
   return internRepository.save(intern);
     
   }
   else{
      System.out.println("cannot find");
      return null;
   }
      
}
/*public Intern updateIntern(Long id, Intern internDetails) {
        Optional<Intern> optionalIntern = internRepository.findById(id);

        // If the intern is present, update it
        optionalIntern.ifPresent(intern -> {
            intern.setName(internDetails.getName());
            intern.setEmail(internDetails.getEmail());
            // Update other fields as necessary...
            internRepository.save(intern); // Save changes
        });

        // Throw an exception if the intern is not found
        return optionalIntern.orElseThrow(() -> new ResourceNotFoundException("Intern not found with id " + id));
    } */

public Intern deleteIntern(Long id){
Optional<Intern> optionintern=internRepository.findById(id);

if(optionintern.isPresent()){
   Intern deletint=optionintern.get();
 internRepository.delete(deletint);
 return deletint;
}
else{
   return null;
}
}
}