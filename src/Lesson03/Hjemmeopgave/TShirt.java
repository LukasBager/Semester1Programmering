package Lesson03.Hjemmeopgave;

public class TShirt {

    String color;
    String size;
    String print;
    double cost;

    public TShirt(String color, String size, String print, double cost) {
        this.color = color;
        this.size = size;
        this.print = print;
        this.cost = cost;
    }

    public void infoAboutShirt() {
        System.out.println("I have a " + color + " T-Shirt in a size " + size + " with a " + print + " print. It cost me $" + Double.toString(cost));
    }

}
