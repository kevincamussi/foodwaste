
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class WasteManagementSystem {
    private ArrayList<FoodItem> foodItems;
    private ArrayList<User> users;
    private Scanner scanner;

    public WasteManagementSystem() {
        foodItems = new ArrayList<>();
        users = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Waste Management System");

        while (true) {
            System.out.println("\n1. Register Food Item");
            System.out.println("2. View Available Food Items");
            System.out.println("3. Register as a User");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerFoodItem();
                    break;
                case 2:
                    viewFoodItems();
                    break;
                case 3:
                    registerUser();
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void registerFoodItem() {
        System.out.print("Enter food name: ");
        String name = scanner.nextLine();

        System.out.print("Enter expiry date (YYYY-MM-DD): ");
        LocalDate expiryDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter donor name: ");
        String donor = scanner.nextLine();

        FoodItem foodItem = new FoodItem(name, expiryDate, donor);
        foodItems.add(foodItem);

        System.out.println("Food item registered successfully!");
    }

    private void viewFoodItems() {
        if (foodItems.isEmpty()) {
            System.out.println("No food items available.");
        } else {
            System.out.println("Available Food Items:");
            for (FoodItem item : foodItems) {
                System.out.println(item);
            }
        }
    }

    private void registerUser() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your contact info: ");
        String contactInfo = scanner.nextLine();

        User user = new User(name, contactInfo);
        users.add(user);

        System.out.println("User registered successfully!");
    }
}
