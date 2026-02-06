import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalSystem {
    private static List<Car> carList = new ArrayList<>();

    public static void main(String[] args) {
        initializeCars();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Car Rental System!");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (User.authenticate(username, password)) {
            System.out.println("Login successful!");
            showCars();
            // Further functionality like renting and returning cars can be added here.
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }
        
        scanner.close();
    }

    private static void initializeCars() {
        carList.add(new Car("Toyota Corolla"));
        carList.add(new Car("Honda Accord"));
        carList.add(new Car("Ford Mustang"));
    }

    private static void showCars() {
        System.out.println("Available Cars:");
        for (Car car : carList) {
            if (car.isAvailable()) {
                System.out.println(car.getModel());
            }
        }
    }
}