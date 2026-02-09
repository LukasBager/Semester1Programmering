package Lesson05;

import java.util.Scanner;

public class RideTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double guestHeight;

        System.out.println("Hvor høj er du?");
        guestHeight = scanner.nextDouble();

        Ride denGamleRutsjebane = new Ride("Den Gamle Rutsjebane", 150, guestHeight);
        denGamleRutsjebane.checkHeight();

    }

}
