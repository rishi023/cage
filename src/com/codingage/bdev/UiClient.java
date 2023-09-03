package com.codingage.bdev;

import com.codingage.bdev.controllers.RestaurantController;
import com.codingage.bdev.controllers.UserController;
import com.codingage.bdev.models.User;
import com.codingage.bdev.models.request.CreateRestaurantRequest;
import com.codingage.bdev.models.response.RestaurantResponse;

public class UiClient {

    final static UserController userController = new UserController();
    final static RestaurantController restaurantController = new RestaurantController();
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


        CreateRestaurantRequest createRestaurantRequest = new CreateRestaurantRequest();
        createRestaurantRequest.setName("Coffee Shop by Priya");
        createRestaurantRequest.setOwnerName("Sonam");
        createRestaurantRequest.setOwnerContactNumber("9898989898");

        restaurantController.createRestaurant(createRestaurantRequest);


        RestaurantResponse response = restaurantController.getRestaurantByOwnerNumber("989898402489898");
        if(response.isError()){
            System.out.println(response.getErrorMessage());
        }else{
            System.out.println(response.getOwnerName());
            System.out.println(response.getName());
        }

    }
}

