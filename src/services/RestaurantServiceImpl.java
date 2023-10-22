package services;

import models.*;

import java.util.ArrayList;

public class RestaurantServiceImpl implements RestaurantService {

    @Override
    public Restaurant createRestaurant() {
        Restaurant restaurant = new Restaurant();
        restaurant.setTableList(new ArrayList<>());
        restaurant.setReservationList(new ArrayList<>());
        return restaurant;
    }

    @Override
    public void addTable(Table table, Restaurant restaurant) {
        restaurant.getTableList().add(table);
    }

    @Override
    public void assignCustomerTable(Customer customer, Restaurant restaurant) {
        for (Table table : restaurant.getTableList()) {
            if (table.getStatus() == TableStatus.AVAILABLE && table.getCapacity() >= customer.getPartySize()) {
                table.setStatus(TableStatus.RESERVED);
                addReservation(restaurant, table, customer);
                System.out.println("Table successfully reserved : " + table.getTableName());
                return;
            }
        }
        System.out.println("Something went wrong! ");
    }

    public void addReservation(Restaurant restaurant, Table table, Customer customer) {
        Reservation reservation = new Reservation();
        reservation.setCustomer(customer);
        reservation.setTable(table);
        restaurant.getReservationList().add(reservation);
    }
}