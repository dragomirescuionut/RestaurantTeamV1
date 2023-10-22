import models.Customer;
import models.Restaurant;
import models.Table;
import models.TableStatus;
import services.*;

public class RestaurantApp {
    public static void main(String[] args) {
        TableService tableService = new TableServiceImpl();
        RestaurantService restaurantService = new RestaurantServiceImpl();
        CustomerService customerService = new CustomerServiceImpl();

        Restaurant restaurant = restaurantService.createRestaurant();
        Table table1 = tableService.createTable("Divorce Table", 8, TableStatus.OCCUPIED);
        Table table2 = tableService.createTable("Ghost Table", 4, TableStatus.RESERVED);
        Table table3 = tableService.createTable("Fun Table", 2, TableStatus.AVAILABLE);
        Customer customer = customerService.createCustomer("Keanu", 2);

        restaurantService.addTable(table1, restaurant);
        restaurantService.addTable(table2, restaurant);
        restaurantService.addTable(table3, restaurant);
        restaurantService.assignWalkInCustomerTable(customer, restaurant);
        restaurantService.removeTable(table2, restaurant);

        System.out.println(restaurant.getTableList());
        System.out.println(restaurant.getReservationList());

    }
}