package com.lxisoft.intrack.careerguidance.service;
import java.util.List;
import java.util.stream.Collectors;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.QuestionControllerApi;
import org.openapitools.client.model.QuestionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.lxisoft.intrack.careerguidance.entity.UserEntity;
import com.lxisoft.intrack.careerguidance.repo.UserRepo;

@Service
public class UserService{

@Autowired
UserRepo userRepo;

    public List<QuestionEntity> questionShow() throws ApiException{
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8081");

        QuestionControllerApi questionControllerApi = new QuestionControllerApi(apiClient);

    List<QuestionEntity> questionShowing = questionControllerApi.readQuestions();

    return questionShowing;

    }

    public UserEntity createUser(@RequestBody UserEntity userEntity){
    
         return userRepo.save(userEntity);
    }

    public List<UserEntity> showUsers(){

        List<UserEntity> readUser = userRepo.findAll().stream()
                                .map(userEntity ->{
                                    UserEntity user = new UserEntity();
                                    user.setUserName(user.getUserName());
                                    user.setSkills(user.getSkills());
                                    return user;
                                }).collect(Collectors.toList());
        return readUser;
    }

    public UserEntity updateUser(Long userId, UserEntity userEntity) {
        UserEntity update = userRepo.findById(userId).orElse(null);

        if (update==null) {
            throw new RuntimeException("error:" + userId);
        }
        update.setUserName(userEntity.getUserName());
        update.setSkills(userEntity.getSkills());

        return userRepo.save(update);
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }

}