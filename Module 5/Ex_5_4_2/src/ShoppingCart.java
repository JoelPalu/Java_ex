import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> item = new ArrayList<Item>();

    public void addItem(String name, double price) {
        item.add(new Item(name, price));
    }

    public void removeItem(String name) {
        for(Item i : item) {
            if(i.getName().equals(name)) {
                item.remove(i);
                break;
            }
        }

    }

    public double getTotalCost() {
        double totalcost = 0;

        for (Item i : item) {
            totalcost += i.getPrice();
        }
        return totalcost;
    }

    public int getItemCount() {
        return item.size();
    }
}
