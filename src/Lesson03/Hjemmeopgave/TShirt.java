package Lesson03.Hjemmeopgave;

public class TShirt {

    String color;
    String size;
    String print;
    double cost;
    String fit;

    public TShirt(String color, String size, String print, double cost, String fit) {
        this.color = color;
        this.size = size;
        this.print = print;
        this.cost = cost;
        this.fit = fit;
    }

    public void infoAboutShirt() {
        System.out.println("I have a " + color + " T-Shirt in a size " + size + " with a " + print + " print in a " + fit + " fit. It cost me $" + Double.toString(cost));
    }

}
