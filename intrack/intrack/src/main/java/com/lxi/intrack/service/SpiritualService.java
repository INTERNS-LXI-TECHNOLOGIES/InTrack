package com.lxi.intrack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxi.intrack.SpiritualDimension;
import com.lxi.intrack.repository.SpiritualRepo;


@Service
public class SpiritualService
{
    @Autowired
    SpiritualRepo spRepo;
    
    public String create(SpiritualDimension spDimension)
    {
        spRepo.save(spDimension);
        System.out.print(spDimension.getActivity());
        System.out.print(spDimension.getDuration());
        return "Activity Successfully Created";
    }

    public List<SpiritualDimension> read()
    {
      return spRepo.findAll();  
    }

   


    public SpiritualDimension update(SpiritualDimension spDimension,Long id)
    {
        Optional<SpiritualDimension> oldSpDimension = spRepo.findById(id);
        
        if(oldSpDimension.isPresent())
        {
            SpiritualDimension newSpDimension = oldSpDimension.get();

            newSpDimension.setActivity(spDimension.getActivity());
            newSpDimension.setDuration(spDimension.getDuration());
            spRepo.save(newSpDimension);
            return newSpDimension ;

        }
        else
        {
            return null;
        }
    }

    public  String delete(Long id)
    {
        SpiritualDimension dSpDimension = spRepo.findById(id).orElse(null);
        spRepo.delete(dSpDimension);
        return dSpDimension.getActivity() + "Activity Deleted";
    }
       
    
}