package Hyblerne;

public class Hyblist {

    private String navn;
    private int alder;
    private String gender;
    private int husNummer;

    public Hyblist(String navn, int alder, String gender, int husNummer) {
        this.navn = navn;
        this.alder = alder;
        this.gender = gender;
        this.husNummer = husNummer;
    }

    public void sigHej() {
        System.out.println("Hej mit navn er " + navn + ". Jeg er " + alder + " år gammel, jeg er en " + gender + ", og jeg bor i nummer " + husNummer + ".");
    }

}