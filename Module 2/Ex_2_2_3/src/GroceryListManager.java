import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryListManager {
    private Map<String, String> groceryList;
    private Map<String, ArrayList<String>> categorizedItems;
    private Map<String, Double> itemPrices;

    public GroceryListManager() {
        groceryList = new HashMap<>();
        categorizedItems = new HashMap<>();
        itemPrices = new HashMap<>();
    }

    public void addItemWithCategory(String item, String category, double price) {
        if (item.isBlank()) {
            System.out.println("Error: Item name cannot be empty.");
            return;
        }

        groceryList.put(item, category);
        if (!categorizedItems.containsKey(category)) {
            categorizedItems.put(category, new ArrayList<>());
        }
        categorizedItems.get(category).add(item);
        itemPrices.put(item, price);
        System.out.println("Added \"" + item + "\" to the grocery list with category: " + category + " and price: $" + price);
    }

    public void addItem(String item, double price) {
        addItemWithCategory(item, "Uncategorized", price);
    }

    public void removeItem(String item) {
        if (item.isBlank()) {
            System.out.println("Error: Item name cannot be empty.");
            return;
        }

        if (groceryList.containsKey(item)) {
            String category = groceryList.get(item);
            groceryList.remove(item);
            categorizedItems.get(category).remove(item);
            itemPrices.remove(item);
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
            for (Map.Entry<String, String> entry : groceryList.entrySet()) {
                String itemName = entry.getKey();
                String category = entry.getValue();
                double price = itemPrices.get(itemName);
                System.out.println(itemName + " - Category: " + category + ", Price: $" + price);
            }
        }
    }

    public void displayByCategory(String category) {
        if (category.isBlank()) {
            System.out.println("Error: Category cannot be empty.");
            return;
        }

        if (!categorizedItems.containsKey(category) || categorizedItems.get(category).isEmpty()) {
            System.out.println("No items found in category: " + category);
        } else {
            System.out.println("Items in Category " + category + ":");
            for (String item : categorizedItems.get(category)) {
                System.out.println(item + " - Price: $" + itemPrices.get(item));
            }
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (String item : groceryList.keySet()) {
            totalCost += itemPrices.get(item);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add item with category and price");
            System.out.println("2. Add item without category and price");
            System.out.println("3. Remove item");
            System.out.println("4. Display list");
            System.out.println("5. Display items by category");
            System.out.println("6. Calculate total cost");
            System.out.println("7. Exit");
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
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    manager.addItemWithCategory(addItem, category, price);
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    String addItemWithoutCategory = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double priceWithoutCategory = Double.parseDouble(scanner.nextLine());
                    manager.addItem(addItemWithoutCategory, priceWithoutCategory);
                    break;
                case 3:
                    System.out.print("Enter item to remove: ");
                    String removeItem = scanner.nextLine();
                    manager.removeItem(removeItem);
                    break;
                case 4:
                    manager.displayList();
                    break;
                case 5:
                    System.out.print("Enter category to display items: ");
                    String displayCategory = scanner.nextLine();
                    manager.displayByCategory(displayCategory);
                    break;
                case 6:
                    System.out.println("Total cost of all items: $" + manager.calculateTotalCost());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}
