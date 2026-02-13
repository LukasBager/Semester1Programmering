package ArrayListOOP;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Integer> cart;


    public Cart() {
        this.cart = new ArrayList<>();
    }


    // Add items to cart
    public void addItem(int itemID) {
        cart.add(itemID);
    }

    // Remove items from cart
    public void removeItem(int index) {
        // i parantesen efter .remove kan man også skrive værdien af et item i en array, dog ikke med integers, da programmet opfatter tal som index i ArrayList i stedet for værdi
        cart.remove(index);
    }

    // Getter
    public int getItem(int index) {
        return cart.get(index);
    }

    // Setter
    public void setItem(int index, int itemID) {
        cart.set(index, itemID);
    }

    public int getIndex(int itemID) {
        return cart.indexOf(itemID);
    }


    // Amount of items in cart
    public int amountOfItemsInCart() {
        return cart.size();
    }

    // toString method for ArrayList
    @Override
    public String toString() {
        return cart.toString();
    }

}
