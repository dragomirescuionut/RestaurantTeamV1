package services;

import models.*;

import java.time.LocalDate;
import java.time.LocalTime;
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
    public void removeTable(Table table, Restaurant restaurant) {
        restaurant.getTableList().remove(table);
    }

    @Override
    public void assignWalkInCustomerTable(Customer customer, Restaurant restaurant) {
        for (Table table : restaurant.getTableList()) {
            if (table.getStatus() == TableStatus.AVAILABLE && table.getCapacity() >= customer.getPartySize()) {
                table.setStatus(TableStatus.RESERVED);
                addReservation(restaurant, table, customer);
                System.out.println("Table successfully reserved : " + table.getTableName());
                return;
            }
        }
        System.out.println("Something went wrong!");
    }

    @Override
    public void getDayReservations(LocalDate date, Restaurant restaurant) {
        for (Reservation reservation : restaurant.getReservationList()) {
            if (reservation.getDate().equals(date)) {
                System.out.println(reservation);
            } else {
                System.out.println("No reservations for today");
            }
        }
    }

    public void addReservation(Restaurant restaurant, Table table, Customer customer) {
        ReservationService reservationService = new ReservationServiceImpl();
        Reservation reservation = reservationService.createReservation(customer, table, LocalDate.now(), LocalTime.now());
        restaurant.getReservationList().add(reservation);
    }
}