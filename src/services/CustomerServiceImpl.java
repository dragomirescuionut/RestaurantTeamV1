package services;

import models.Customer;
import models.Restaurant;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer createCustomer(String name, int partySize) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setPartySize(partySize);
        return customer;
    }

    @Override
    public void reserveTable(Customer customer, Restaurant restaurant) {
        // To be added
    }

    @Override
    public void cancelReservation(Customer customer, Restaurant restaurant) {
        // To be added
    }
}
