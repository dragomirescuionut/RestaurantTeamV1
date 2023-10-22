package models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Table> tableList;
    private List<Reservation> reservationList;

    public Restaurant() {
        tableList = new ArrayList<>();
        reservationList = new ArrayList<>();
    }

    public List<Table> getTableList() {
        return tableList;
    }

    public void addReservation(Reservation reservation) {
        reservationList.add(reservation);
    }
}