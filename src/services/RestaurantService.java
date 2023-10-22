package services;

import models.Customer;
import models.Restaurant;
import models.TableStatus;

public interface RestaurantService {
    void createAndAddTable(String name, int capacity, TableStatus tableStatus);

    // boolean canAccommodate(Customer customer);
    void assignCustomerTable(Customer customer);
}