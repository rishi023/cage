package com.codingage.bdev.repository;

import com.codingage.bdev.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> userList = new ArrayList<>();

    public UserRepository() {
        for(int i = 0 ; i < 10 ; i++){
            User user = new User();
            user.setName("Abhishek " +  i);
            user.setPassword("Abhishek " +  i);
            user.setEmailId("cage " +  i + "@gmail.com");
            user.setPhoneNumber("999090909 " +  i);

            userList.add(user);
        }
    }

    public List<User> addUser(User user){
        userList.add(user);
        return userList;
    }
    public List<User> getUserList(){
        return userList;
    }
}
