package Lesson03.Hjemmeopgave;

public class TShirtTest {

    public static void main(String[] args) {

        TShirt first = new TShirt("green", "M", "Woodstock", 19.99);

        // Unødvendigt efter constructor tilføjet
        /*
        first.color = "Green";
        first.size = "M";
        first.print = "Woodstock";
        first.cost = 19.99;
        */

        first.infoAboutShirt();


        TShirt second = new TShirt("black", "S", "blank", 29.99);
        second.infoAboutShirt();

    }

}
