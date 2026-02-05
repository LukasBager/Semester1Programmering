package Lesson03.Hjemmeopgave;

public class TShirtTest {

    public static void main(String[] args) {

        TShirt first = new TShirt("green", "M", "Woodstock", 19.99, "slim");
        first.infoAboutShirt();

        TShirt second = new TShirt("black", "S", "blank", 29.99, "regular");
        second.infoAboutShirt();

    }

}
