package LegeRundt;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv et tal (kun hele tal)");

        try {
            num = scanner.nextInt();
            loop(num);
        } catch (Exception e) {
            System.out.println("Du skal skrive et tal (kun hele tal)");
        }

    }

    public static void loop(int num) {
        int i = 1;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }

}
