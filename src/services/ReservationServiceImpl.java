package services;

import models.Customer;
import models.Reservation;
import models.Table;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationServiceImpl implements ReservationService {

    @Override
    public Reservation createReservation(Customer customer, Table table, LocalDate date, LocalTime time) {
        Reservation reservation = new Reservation();
        reservation.setCustomer(customer);
        reservation.setTable(table);
        reservation.setDate(date);
        reservation.setTime(time);
        return reservation;
    }

    @Override
    public void changeReservationDate() {
        // To be added
    }

    @Override
    public void changeReservationTime() {
        // To be added
    }

    @Override
    public void changePartySize() {
        // To be added
    }
}
