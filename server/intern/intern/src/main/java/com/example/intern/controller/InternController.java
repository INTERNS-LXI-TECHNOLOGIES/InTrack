package com.example.intern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.intern.model.Intern;
import com.example.intern.service.InternService;








@RestController
@RequestMapping("/api/intern/showall")


public class InternController {
@Autowired
InternService internService;

@GetMapping()
    public List<Intern> getInterns() {
        return internService.getAllResources();
    }

@PostMapping("/create")
public void createIntern(@RequestBody Intern intern) {
    if (intern == null) {
        throw new IllegalArgumentException("Intern object is missing in the request body.");
    }
    internService.createIntern(intern);
    }


    

    @PutMapping("/update/{id}")
    public void updateIntern(@PathVariable Long id, @RequestBody Intern entity) throws RuntimeException{
        
        internService.updateIntern(id, entity);
    
    }

    @PutMapping("updateName/{name}")
    public void putMethodName(@PathVariable String name, @RequestBody Intern entity) {
        
        internService.upIntern(name, entity);
    }

    @DeleteMapping("/delete/{id}")
    public void delIntern(@PathVariable Long id ){
        internService.deleteIntern(id);
    
    



    
}
}
