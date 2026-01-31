package LegeRundt;

import java.util.Scanner;

public class VPN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvilken server vil du forbinde til? Svar \"1\", \"2\", \"3\", \"4\", \"5\", \"6\", \"7\", \"8\" eller \"9\"");

        try {
            int desiredServer = scanner.nextInt();
            switch (desiredServer) {
                case 1:
                    System.out.println("Du er nu forbundet til DK#1");
                    break;
                case 2:
                    System.out.println("Du er nu forbundet til DK#2");
                    break;
                case 3:
                    System.out.println("Du er nu forbundet til DK#3");
                    break;
                case 4:
                    System.out.println("Du er nu forbundet til DK#4");
                    break;
                case 5:
                    System.out.println("Du er nu forbundet til DK#5");
                    break;
                case 6:
                    System.out.println("Du er nu forbundet til DK#6");
                    break;
                case 7:
                    System.out.println("Du er nu forbundet til DK#7");
                    break;
                case 8:
                    System.out.println("Du er nu forbundet til DK#8");
                    break;
                case 9:
                    System.out.println("Du er nu forbundet til DK#9");
                    break;
                default:
                    System.out.println("Ugyldig server indtastet");
            }
        } catch (Exception e) {
            System.out.println("Du skal skrive et tal");
        }

    }

}
