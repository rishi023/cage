package bdev.service;

import com.codingage.bdev.models.User;
import com.codingage.bdev.repository.UserRepository;

import java.util.List;

public class UserService {


    final UserRepository userRepository = new UserRepository();

    public List<User> addUser(User user) {
        return userRepository.addUser(user);
    }

    public List<User> getUser() {
        return userRepository.getUserList();
    }

    public User signInUser(String phoneNumber, String password) {
        for (User user : getUser()) {
            if (user.getPhoneNumber().equals(phoneNumber)) {
                if (user.getPassword().equals(password)) {
                    return user;
                }
            }


        }
        return null;
    }
}
