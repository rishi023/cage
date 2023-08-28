package bdev;

import com.codingage.bdev.controllers.UserController;
import com.codingage.bdev.models.User;

public class UiClient {

    final static UserController userController = new UserController();
    public static void main(String[] args) {
        // register
        User user = new User();
        user.setPhoneNumber("99999999999");
        user.setEmailId("abc@gmail.com");
        user.setPassword("1313");
        user.setName("Sonam");

        userController.regsiterUser(user);

        userController.getUser();

        System.out.println(userController.signInUser("99999999999", "1313").toString());



    }
}

