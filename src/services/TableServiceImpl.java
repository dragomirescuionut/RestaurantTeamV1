package services;

import models.Table;
import models.TableStatus;

public class TableServiceImpl implements TableService {
    @Override
    public Table createTable(String name, int capacity, TableStatus tableStatus) {
        return new Table(name, capacity, tableStatus);
    }

    @Override
    public void removeTable(String name) {

    }
}