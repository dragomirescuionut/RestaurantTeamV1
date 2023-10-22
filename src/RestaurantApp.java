import models.Customer;
import models.Restaurant;
import models.Table;
import models.TableStatus;
import services.RestaurantService;
import services.RestaurantServiceImpl;
import services.TableService;
import services.TableServiceImpl;

public class RestaurantApp {
    public static void main(String[] args) {
        TableService tableService = new TableServiceImpl();
        RestaurantService restaurantService = new RestaurantServiceImpl();

        Restaurant restaurant = restaurantService.createRestaurant();
        Table table1 = tableService.createTable("Divorce Table", 8, TableStatus.OCCUPIED);
        Table table2 = tableService.createTable("Ghost Table", 4, TableStatus.RESERVED);
        Table table3 = tableService.createTable("Fun Table", 2, TableStatus.AVAILABLE);
        Customer customer = new Customer("Mr. Haplea",2);

        restaurantService.addTable(table1, restaurant);
        restaurantService.addTable(table2, restaurant);
        restaurantService.addTable(table3, restaurant);

        restaurantService.assignCustomerTable(customer, restaurant);
        System.out.println(restaurant.getReservationList());

    }
}