package Lesson04;

public class TidTest {

    public static void main(String[] args) {

        Tid start = new Tid(17, 31, 28);
        start.printTime();

        Tid slut = new Tid(17, 39, 24);

        int tidBrugt = slut.totalSekunder - start.totalSekunder;
        System.out.println("Der er gået " + tidBrugt + " sekunder med at lave opgaven");

    }

}
