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
import com.demo.interns.Entity.SocialChallages;
import com.demo.interns.Service.ChallengeServics;
import com.demo.interns.Service.InternService;

@RestController
@RequestMapping("/rest/interns")
public class ChallengeController {

    @Autowired
private ChallengeServics challengeServics;

    @PostMapping("/addChallenges")
public SocialChallages addChallenges(@RequestBody SocialChallages socialChallages){
 return challengeServics.addChallenges(socialChallages);
}

@GetMapping("/getAll")
public List<SocialChallages> getAll(){
    return challengeServics.getAll();
   }

@PutMapping("updateChallenges/{id}")
    public SocialChallages updateChallenges(@PathVariable Long id, @RequestBody SocialChallages socialChallages) {
        return challengeServics.updateChallenges(id, socialChallages);
    }

    // Delete user by ID
    @DeleteMapping("/deleteChallenges/{id}")
    public void deleteChallenges(@PathVariable Long id) {
        challengeServics.deleteChallenges(id);
    }   

}
