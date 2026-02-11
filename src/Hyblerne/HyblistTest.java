package Hyblerne;

import java.util.Scanner;

public class HyblistTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv dit navn");
        String navn = scanner.next();

        System.out.println("Skriv din alder");
        int alder = scanner.nextInt();

        System.out.println("Skriv dit køn");
        String gender = scanner.next();

        System.out.println("Skriv dit husnummer");
        int husNummer = scanner.nextInt();

        Hyblist hyblist1 = new Hyblist(navn, alder, gender, husNummer);
        hyblist1.sigHej();

        scanner.close();
    }

}
