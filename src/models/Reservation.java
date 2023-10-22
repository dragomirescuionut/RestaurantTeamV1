package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
    private Customer customer;
    private Table table;
    private LocalDate date;
    private LocalTime time;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", table=" + table +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}