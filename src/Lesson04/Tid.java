package Lesson04;

public class Tid {

    int time;
    int minut;
    int sekund;
    int totalSekunder;
    int tilbage;

    public Tid(int time, int minut, int sekund) {
        this.time = time;
        this.minut = minut;
        this.sekund = sekund;
        this.totalSekunder = time * 3600 + minut * 60 + sekund;
        this.tilbage = 86400 - totalSekunder;
    }

    public void printTime() {
        System.out.println("Timer: " + time);
        System.out.println("Minutter: " + minut);
        System.out.println("Sekunder: " + sekund);
        System.out.println("Siden midnat er der gået " + totalSekunder + " sekunder");
        System.out.println("Der er " + tilbage + " sekunder tilbage af i dag");
    }

}
