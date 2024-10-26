package com.divisosoft.mindfullness.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.divisosoft.mindfullness.model.Activities;
import com.divisosoft.mindfullness.model.UserPreference;
import com.divisosoft.mindfullness.repository.ActivitesRepository;
import com.divisosoft.mindfullness.repository.UserPreferenceRepository;

@Service
public class MindService{

    @Autowired
    private ActivitesRepository activitesRepository ;

    @Autowired
    private UserPreferenceRepository userPreferenceRepository ;

    public List<UserPreference> getActivity(){
        List<Activities> activities = activitesRepository.findAll();

        /*for(int i=0;i<activities.size();i++){
            UserPreference userPreference = new UserPreference();
            userPreference.setUserId(2);
            userPreference.setActivity(activities.get(i).getActivity());
            userPreference.setDescription(activities.get(i).getDescription());
            userPreference.setFrequency(null);
            userPreferenceRepository.save(userPreference);
        }*/
        List<UserPreference> userPreferences = userPreferenceRepository.findAllByUserId(1);
        return userPreferences;
    }  
}