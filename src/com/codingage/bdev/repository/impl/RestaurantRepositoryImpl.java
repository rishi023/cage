package com.codingage.bdev.repository.impl;

import com.codingage.bdev.models.Restaurant;
import com.codingage.bdev.models.request.CreateRestaurantRequest;
import com.codingage.bdev.repository.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepositoryImpl implements RestaurantRepository {

    private List<Restaurant> restaurantList = new ArrayList<>();



    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    @Override
    public Restaurant createRestaurant(CreateRestaurantRequest request) {
        Restaurant restaurant = new Restaurant();

        restaurant.setName(request.getName());
        restaurant.setOwnerName(request.getOwnerName());
        restaurant.setOwnerContactNumber(request.getOwnerContactNumber());

        restaurant.setId(String.valueOf(System.currentTimeMillis()));

        //db save
        getRestaurantList().add(restaurant);
        return restaurant;
    }

    @Override
    public Restaurant getRestaurantByOwnerNumber(String phoneNumber) {
        List<Restaurant> restaurants = getRestaurantList();
        for(Restaurant res : restaurants){
            if(res.getOwnerContactNumber().equals(phoneNumber)){
                return res;
            }
        }
        return null;

    }


}
