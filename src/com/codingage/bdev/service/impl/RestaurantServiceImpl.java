package com.codingage.bdev.service.impl;

import com.codingage.bdev.models.Restaurant;
import com.codingage.bdev.models.request.CreateRestaurantRequest;
import com.codingage.bdev.models.response.RestaurantResponse;
import com.codingage.bdev.repository.RestaurantRepository;
import com.codingage.bdev.repository.impl.RestaurantRepositoryImpl;
import com.codingage.bdev.service.RestaurantService;

public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantRepository restaurantRepository = new RestaurantRepositoryImpl();
    @Override
    public Restaurant createRestaurant(CreateRestaurantRequest request) {
        return restaurantRepository.createRestaurant(request);
    }

    @Override
    public RestaurantResponse getRestaurantByOwnerNumber(String phoneNumber) {
        Restaurant restaurant = restaurantRepository.getRestaurantByOwnerNumber(phoneNumber);
        RestaurantResponse res = new RestaurantResponse();
        if(restaurant == null){
            res.setError(true);
            res.setErrorMessage("No restaurant found");
        }else {
            res.setName(restaurant.getName());
            res.setOwnerName(restaurant.getOwnerName());
        }

        return res;
    }
}
