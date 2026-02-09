package Lesson05;

public class Ride {

    String rideName;
    double minHeight;
    double guestHeight;

    public Ride(String rideName, double minHeight, double guestHeight) {
        this.rideName = rideName;
        this.minHeight = minHeight;
        this.guestHeight = guestHeight;
    }

    public void checkHeight() {
        /* System.out.println("Minimumshøjden for " + rideName +  "er " + minHeight + " cm");
        System.out.println("Du er " + guestHeight + " cm høj"); */
        if (guestHeight >= minHeight) {
            System.out.println("Du er høj nok til " + rideName + ". Nyd turen! :D");
        } else {
            System.out.println("Desværre, du er ikke høj nok til " + rideName + ". Kom tilbage, når du er højere :(");
        }
    }

}
