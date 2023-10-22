package services;

import models.*;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService {
    TableService tableService;
    Restaurant restaurant;

    public RestaurantServiceImpl(TableService tableService, Restaurant restaurant) {
        this.tableService = tableService;
        this.restaurant = restaurant;
    }

    @Override
    public void createAndAddTable(String name, int capacity, TableStatus tableStatus) {
        Table table = tableService.createTable(name, capacity, tableStatus);
        restaurant.getTableList().add(table);
    }

    //    public boolean canAccommodate(Customer customer) {
//        int partySize = customer.getPartySize();
//        List<Table> tableList = restaurant.getTableList();
//        for (Table table : tableList) {
//            if (table.getStatus() == TableStatus.AVAILABLE && table.getCapacity() >= partySize) {
//                return true;
//            }
//        }
//        return false;
//    }
    public void assignCustomerTable(Customer customer) {
        Reservation reservation = new Reservation();
        int partySize = customer.getPartySize();
        List<Table> tableList = restaurant.getTableList();
        for (Table table : tableList) {
            if (table.getStatus() == TableStatus.AVAILABLE && table.getCapacity() >= partySize) {
                reservation.setCustomer(customer);
                reservation.setTable(table);
                table.setStatus(TableStatus.RESERVED);
                restaurant.addReservation(reservation);
                System.out.println("Table successfully reserved : " + table.getTableName());
                return;
            }
        }
        System.out.println("Something went wrong! ");
    }
}