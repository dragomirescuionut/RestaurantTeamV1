package models;

import java.util.List;

public class Restaurant {
    private List<Table> tableList;
    private List<Reservation> reservationList;

    public List<Table> getTableList() {
        return tableList;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setTableList(List<Table> tableList) {
        this.tableList = tableList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}