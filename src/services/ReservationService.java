package services;

import models.Customer;
import models.Reservation;
import models.Table;

import java.time.LocalDate;
import java.time.LocalTime;

public interface ReservationService {
    Reservation createReservation(Customer customer, Table table, LocalDate date, LocalTime time);
    void changeReservationDate();
    void changeReservationTime();
    void changePartySize();
}
