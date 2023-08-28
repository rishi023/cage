package bdev.controllers;

import com.codingage.bdev.models.User;
import com.codingage.bdev.service.UserService;

import java.util.List;

// ("/api/v1/add")
public class UserController {


    final UserService userService = new UserService();

    public List<User> regsiterUser(User user) {
        return userService.addUser(user);
    }
    public User signInUser(String phoneNumber, String password) {
        return userService.signInUser(phoneNumber, password);
    }
    public void getUser() {
         userService.getUser().forEach(user1 -> {
             System.out.println(user1.getName());
             System.out.println(user1.getEmailId());
             System.out.println(user1.getPhoneNumber());
         });
    }
}
