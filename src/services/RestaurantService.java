package services;

import models.Customer;
import models.Restaurant;
import models.Table;

public interface RestaurantService {
    Restaurant createRestaurant();
    void addTable(Table table, Restaurant restaurant);
    void assignCustomerTable(Customer customer, Restaurant restaurant);
}