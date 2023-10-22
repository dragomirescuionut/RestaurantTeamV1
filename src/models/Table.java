package models;

public class Table {
    private String tableName;
    private int capacity;
    private TableStatus status;

    public Table(String tableName, int capacity, TableStatus status) {
        this.tableName = tableName;
        this.capacity = capacity;
        this.status = status;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }
}