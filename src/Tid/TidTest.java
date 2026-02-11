package Tid;

import java.util.Scanner;

public class TidTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvilken time er det nu?");
        int hour = scanner.nextInt();

        System.out.println("Hvilket minut er det nu?");
        int minute = scanner.nextInt();

        System.out.println("Hvilket sekund er det nu?");
        double second = scanner.nextDouble();

        Tid tid = new Tid(hour, minute, second);
        System.out.println(tid);

        scanner.close();
    }

}
