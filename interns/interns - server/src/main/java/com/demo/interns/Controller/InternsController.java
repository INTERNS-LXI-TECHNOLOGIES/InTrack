package com.demo.interns.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.interns.Entity.InternEntity;
import com.demo.interns.Service.InternService;

@RestController
@RequestMapping("/rest/interns")
public class InternsController {

@Autowired
private InternService internService;

@PostMapping("/addInterns")
public InternEntity addInterns(@RequestBody InternEntity interns){
 return internService.addInterns(interns);
}

@GetMapping("/getAll")
public List<InternEntity> getAll(){
    return internService.getAll();
   }

@PutMapping("updateIntern/{id}")
    public InternEntity updateIntern(@PathVariable Long id, @RequestBody InternEntity interns) {
        return internService.updateIntern(id, interns);
    }

    // Delete user by ID
    @DeleteMapping("/deleteIntern/{id}")
    public void deleteIntern(@PathVariable Long id) {
        internService.deleteIntern(id);
    }   
}