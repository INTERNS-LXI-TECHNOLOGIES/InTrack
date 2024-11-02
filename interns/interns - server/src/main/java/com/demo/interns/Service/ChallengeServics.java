package com.demo.interns.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.interns.Entity.SocialChallages;
import com.demo.interns.Repository.ChallangeRepository;



@Service
public class ChallengeServics {
@Autowired
    private ChallangeRepository challangeRepository;
    

    public SocialChallages addChallenges(SocialChallages socialChallages){
       return challangeRepository.save(socialChallages);
    }

    public List<SocialChallages> getAll(){
     return challangeRepository.findAll();
    }

    public SocialChallages updateChallenges(Long id,SocialChallages updateinterns){
        Optional <SocialChallages> internoptional =  challangeRepository.findById(id);

        if(internoptional!=null){
            SocialChallages olderChallenges=internoptional.get();
         olderChallenges.setChallenge(updateinterns.getChallenge());
         olderChallenges.setStatus(updateinterns.getStatus());
         return challangeRepository.save(olderChallenges);
          }
        else{
            return null;
        }  
    }
    
    public void deleteChallenges(Long id){
        Optional <SocialChallages> internopt =  challangeRepository.findById(id);  
      if(internopt!=null){
        SocialChallages existcChallages = internopt.get();
        challangeRepository.delete(existcChallages);
      }
    }

}
