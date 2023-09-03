package com.codingage.bdev.service;

import com.codingage.bdev.models.Restaurant;
import com.codingage.bdev.models.request.CreateRestaurantRequest;
import com.codingage.bdev.models.response.RestaurantResponse;

public interface RestaurantService {
    Restaurant createRestaurant(CreateRestaurantRequest request);

    RestaurantResponse getRestaurantByOwnerNumber(String phoneNumber);
}
