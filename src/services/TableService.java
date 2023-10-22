package services;

import models.Table;
import models.TableStatus;

public interface TableService {
    Table createTable(String name, int capacity, TableStatus tableStatus);

}