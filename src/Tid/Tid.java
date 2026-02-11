package Tid;

public class Tid {

    private int hour;
    private int minute;
    private double second;

    public Tid() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Tid(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("Klokken er: %02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
    }

}
