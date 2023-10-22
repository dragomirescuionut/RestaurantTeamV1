package services;

import models.Table;
import models.TableStatus;

public class TableServiceImpl implements TableService {
    @Override
    public Table createTable(String name, int capacity, TableStatus tableStatus) {
        Table table = new Table();
        table.setTableName(name);
        table.setCapacity(capacity);
        table.setStatus(tableStatus);
        return table;
    }

    @Override
    public void removeTable(String name) {

    }
}