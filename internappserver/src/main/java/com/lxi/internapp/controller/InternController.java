package com.lxi.internapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.lxi.internapp.entity.InternEnity;
import com.lxi.internapp.service.InternService;


@RequestMapping("/api/intern")
@RestController

public class InternController {

@Autowired
InternService internService;

@PostMapping("/create")
public InternEnity create(@RequestBody InternEnity intern){
    return internService.create(intern);
}

@GetMapping("/getAll")
public List<InternEnity> getAll(){
   return internService.getAllResouInterns();
}

@GetMapping("/getId/{id}")
public Optional<InternEnity> getId(@PathVariable Long id){
    return internService.getId(id);
}

@PutMapping("/updateIntern/{id}")
public InternEnity updateIntern(@PathVariable Long id,@RequestBody InternEnity updateintern){
 return internService.updateIntern(id,updateintern);
}

@DeleteMapping("/deleteIntern/{id}")
public void deleteIntern(@PathVariable Long id){
    internService.deleteIntern(id);
    System.out.println("deleted"+id);
}
}
