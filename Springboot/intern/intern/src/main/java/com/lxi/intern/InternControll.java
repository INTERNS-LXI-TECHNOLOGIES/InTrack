package com.lxi.intern;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/intern")
public class InternControll
{
    @Autowired
    private InternService service;


    @PostMapping
    public void  create(@RequestBody Intern intern)
    {
      service.create(intern);  
    } 

    @GetMapping
    public List<Intern> read()
    {
      return service.read(); 
    } 

    @PutMapping("/{id}")
    public Intern update(@PathVariable Long id,@RequestBody Intern updatedIntern) 
    {
      return service.update(id, updatedIntern);
    }
  
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id)
    {
      return service.delete(id);
    }

    
    
}