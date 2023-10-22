package services;

import models.Customer;
import models.Restaurant;

public interface CustomerService {

    Customer createCustomer(String name, int partySize);
    void reserveTable(Customer customer, Restaurant restaurant);
    void cancelReservation(Customer customer, Restaurant restaurant);
}
