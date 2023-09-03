package com.codingage.bdev.repository;

import com.codingage.bdev.models.Restaurant;
import com.codingage.bdev.models.request.CreateRestaurantRequest;

public interface RestaurantRepository {
    Restaurant createRestaurant(CreateRestaurantRequest request);

    Restaurant getRestaurantByOwnerNumber(String phoneNumber);
}
