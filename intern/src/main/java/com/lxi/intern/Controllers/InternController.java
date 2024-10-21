package com.lxi.intern.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxi.intern.models.Intern;
import com.lxi.intern.services.InternService;

@RestController
@RequestMapping("/intern")
public class InternController {
  
  @Autowired
  private InternService internservice;

  @GetMapping
  public List<Intern> getIntern() {
    return internservice.getAllInterns();
  }

  @GetMapping("/{id}")
  public Optional<Intern> getInternById(@PathVariable Long id) {
    return internservice.getInternById(id); 
  }

  @PostMapping
  public void saveIntern(@RequestBody Intern intern) {
    internservice.saveIntern(intern);
  }

  @PutMapping("/{id}")
  public void updateIntern(@PathVariable Long id ,@RequestBody Intern intern){
    internservice.updateIntern(id,intern);
  }

  @DeleteMapping("/{id}")
  public void delIntern(@PathVariable Long id){
    internservice.deleteIntern(id);
  }

}
