package com.divisosoft.Controllers;

import java.util.List;
import java.util.Optional;

import org.openapitools.client.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divisosoft.models.Intern;
import com.divisosoft.services.InternService;

@RestController
@RequestMapping("/intern")
public class InternController {

    @Autowired
    private InternService internService;

    @GetMapping
    public List<org.openapitools.client.model.Intern> getInterns()throws ApiException{
        return internService.getAllInterns();
    }

    @GetMapping("/{id}")
    public Intern getInternById(@PathVariable Long id){
        Optional<Intern>myInternOptional = internService.getIternsById(id);
        if(myInternOptional!=null){
            return myInternOptional.get();
        }
        else{
            return null;
        }
    }

    @PostMapping
    public void createIntern(@RequestBody Intern intern){
        internService.saveIntern(intern);
    }

    @PutMapping("/{id}")
    public void updateInter(@PathVariable Long id,@RequestBody Intern myIntern){
        internService.updatingIntern(id,myIntern);
    }

    @DeleteMapping("/{id}")
    public void deleteIntern(@PathVariable Long id){
        internService.deletingIntern(id);
    }

}
