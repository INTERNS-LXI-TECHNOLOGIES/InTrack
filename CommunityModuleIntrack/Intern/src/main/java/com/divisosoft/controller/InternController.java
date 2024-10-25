package com.divisosoft.controller;

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

import com.divisosoft.model.Intern;
import com.divisosoft.service.InternService;

@RestController
@RequestMapping("/intern")
public class InternController {

@Autowired
private InternService internService;

@PostMapping("/create")
public void createInterns(@RequestBody Intern intern){
    internService.createIntern(intern);
}

@GetMapping("/get")
public List<Intern> getInterns(){
    return internService.getIntern();
}

@PutMapping("/{id}")
public void updateInterns(@PathVariable Long id,@RequestBody Intern intern){
   internService.updateIntern(id,intern);
}

@DeleteMapping("/{id}")
public void deleteInterns(@PathVariable Long id){
    internService.deleteIntern(id);
}
    
}
