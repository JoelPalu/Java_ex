import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryListManager {
    private Map<String, Double> groceryList;

    public GroceryListManager() {
        groceryList = new HashMap<>();
    }

    public void addItem(String item, double cost) {
        if (item.isBlank()) {
            System.out.println("Error: Item name cannot be empty.");
            return;
        }

        if (groceryList.containsKey(item)) {
            System.out.println("\"" + item + "\" is already in the grocery list.");
        } else {
            groceryList.put(item, cost);
            System.out.println("Added \"" + item + "\" to the grocery list with cost: " + cost);
        }
    }

    public void removeItem(String item) {
        if (item.isBlank()) {
            System.out.println("Error: Item name cannot be empty.");
            return;
        }

        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println("Removed \"" + item + "\" from the grocery list.");
        } else {
            System.out.println("\"" + item + "\" is not in the grocery list.");
        }
    }

    public void displayList() {
        if (groceryList.isEmpty()) {
            System.out.println("Grocery list is empty.");
        } else {
            System.out.println("Grocery List:");
            for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
                System.out.println(entry.getKey() + " - $" + entry.getValue());
            }
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (double cost : groceryList.values()) {
            totalCost += cost;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display list");
            System.out.println("4. Calculate total cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String addItem = scanner.nextLine();
                    System.out.print("Enter item cost: ");
                    double cost = Double.parseDouble(scanner.nextLine());
                    manager.addItem(addItem, cost);
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    String removeItem = scanner.nextLine();
                    manager.removeItem(removeItem);
                    break;
                case 3:
                    manager.displayList();
                    break;
                case 4:
                    System.out.println("Total cost of all items: €" + manager.calculateTotalCost());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
