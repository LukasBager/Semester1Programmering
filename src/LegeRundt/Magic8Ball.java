package LegeRundt;

import java.util.Random;

public class Magic8Ball {

    public static void main(String[] args) {

        Random random = new Random();
        int randNum = random.nextInt(10);

        String output = switch (randNum) {
            case 0 -> "Most likely";
            case 1 -> "It is decidedly so";
            case 2 -> "Outlook not so good";
            case 3 -> "It is certain";
            case 4 -> "Reply hazy, try again";
            case 5 -> "Don’t count on it";
            case 6 -> "Signs point to yes";
            case 7 -> "Better not tell you now";
            case 8 -> "As I see it, yes";
            case 9 -> "Very doubtful";
            default -> "An error has occurred. Please try again.";
        };

        System.out.println(output);

    }

}
