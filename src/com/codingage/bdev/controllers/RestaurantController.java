package com.codingage.bdev.controllers;

import com.codingage.bdev.models.Restaurant;
import com.codingage.bdev.models.request.CreateRestaurantRequest;
import com.codingage.bdev.models.response.RestaurantResponse;
import com.codingage.bdev.service.RestaurantService;
import com.codingage.bdev.service.impl.RestaurantServiceImpl;

public class RestaurantController {

    private RestaurantService restaurantService = new RestaurantServiceImpl();

    public Restaurant createRestaurant(CreateRestaurantRequest request){
            return restaurantService.createRestaurant(request);
    }

    public RestaurantResponse getRestaurantByOwnerNumber(String phoneNumber){
        return restaurantService.getRestaurantByOwnerNumber(phoneNumber);
    }

}
