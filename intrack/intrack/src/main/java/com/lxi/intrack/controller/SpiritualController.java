package com.lxi.intrack.controller;

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

import com.lxi.intrack.SpiritualDimension;
import com.lxi.intrack.service.SpiritualService;



@RestController
@RequestMapping("/activity")
public class SpiritualController
{
  @Autowired
  SpiritualService spService; 
  
  @PostMapping
  public String createActivity(@RequestBody SpiritualDimension spDimension)
  {
    return spService.create(spDimension);
  }


  @GetMapping
  public List<SpiritualDimension> showActivity()
  {
    return spService.read();
  }

  @PutMapping("/{id}")
  public SpiritualDimension upadteActivity(@PathVariable Long id,@RequestBody SpiritualDimension spDimension)
  {
    return spService.update(spDimension, id);
  }

  @DeleteMapping("/{id}")
  public String deleteActivity(@PathVariable Long id)
  {
    return spService.delete(id);
  }

}