package bookstore;

import java.util.ArrayList;

public class Inventory extends ArrayList<Item> {

    public Inventory() {

    }

    public void displayAllItems() {

        for (int i = 0; i < super.size(); i++) {
            System.out.println(super.get(i));
            System.out.println("\n");
        }
    }

    public void displayAllBooks() {
        for (int i = 0; i < super.size(); i++) {
            if ((super.get(i)) instanceof Book) {
                System.out.println(super.get(i));
                System.out.println("\n");
            }
        }
    }

    public void displayAllCDs() {
        for (int i = 0; i < super.size(); i++) {
            if ((super.get(i)) instanceof CD) {
                System.out.println(super.get(i));
                System.out.println("\n");
            }
        }
    }

    public void reorder() {
        for (int i = 0; i < super.size(); i++) {
            if (super.get(i).quantitiy() <= 1) {
                System.out.println(super.get(i));
                System.out.println("\n");
            }
        }
    }

    public double totalCost() {
        double totalCost = 0;

        for (int i = 0; i < super.size(); i++) {
            totalCost = totalCost + super.get(i).price();
        }
        return totalCost;
    }

}
