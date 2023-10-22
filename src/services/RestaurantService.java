package services;

import models.Customer;
import models.Restaurant;
import models.Table;

import java.time.LocalDate;

public interface RestaurantService {
    Restaurant createRestaurant();
    void addTable(Table table, Restaurant restaurant);
    void removeTable(Table table, Restaurant restaurant);
    void assignWalkInCustomerTable(Customer customer, Restaurant restaurant);
    void getDayReservations(LocalDate date, Restaurant restaurant);
}