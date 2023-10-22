import models.Customer;
import models.Restaurant;
import models.TableStatus;
import services.RestaurantService;
import services.RestaurantServiceImpl;
import services.TableService;
import services.TableServiceImpl;

public class RestaurantApp {
    public static void main(String[] args) {
        /*RestaurantService restaurantService = new RestaurantServiceImpl();
        restaurantService.createTable("table name");
        restaurantService.makeReservation(customer); -> looks into the tables list
        * */
        Restaurant restaurant = new Restaurant();
        TableService tableService = new TableServiceImpl();
        RestaurantService restaurantService = new RestaurantServiceImpl(tableService, restaurant);
        restaurantService.createAndAddTable("Divorce Table",1, TableStatus.AVAILABLE);
        restaurantService.createAndAddTable("Ghost Table",5, TableStatus.AVAILABLE);
        restaurantService.createAndAddTable("Fun Table",2, TableStatus.AVAILABLE);

        Customer customer = new Customer("Mr. Haplea",2);
       // boolean result = restaurantService.canAccommodate(customer);
       // System.out.println(result);
        restaurantService.assignCustomerTable(customer);
    }
}