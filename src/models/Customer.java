package models;

public class Customer {
    private String name;
    private int partySize;

    public Customer(String name, int partySize) {
        this.name = name;
        this.partySize = partySize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }
}