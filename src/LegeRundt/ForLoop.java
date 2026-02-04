package LegeRundt;

public class ForLoop {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.print("\n");

        String[] familyMembers = {"Lukas", "Rasmus", "Morten", "Stine"};
        int antalMedlemmer = familyMembers.length;

        System.out.println("Antal familiemedlemmer: " + antalMedlemmer);

        System.out.print("\n");

        for (int i = 0; i < antalMedlemmer; i++) {
            System.out.println(familyMembers[i]);
        }

    }

}
