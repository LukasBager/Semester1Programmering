package Lesson04;

import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        String year;
        String month;
        String day;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvilket år er det?");
        year = scanner.nextLine();

        System.out.println("Hvilken måned er det?");
        month = scanner.nextLine();

        System.out.println("Hvilken dag i måneden er det?");
        day = scanner.nextLine();

        String dateInAmericanFormat = month + " " + day + ", " + year;
        String dateInEuropeanFormat = day + " " + month + " " + year;

        System.out.println("Amerikansk format: " + dateInAmericanFormat);
        System.out.println("Europæisk format: " + dateInEuropeanFormat);

    }

}
