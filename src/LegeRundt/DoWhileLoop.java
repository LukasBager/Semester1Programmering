package LegeRundt;

public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 0;

        // KØRER ALTID MINIMUM 1 GANG, OG FORTSÆTTER DEREFTER SÅ LÆNGE CONDITION OPFYLDES - KØRER DERFOR KUN 1 GANG HER
        do {
            System.out.println(i);
        } while (i > 0);


        System.out.print("\n");


        do {
            System.out.println(i);
            i++;
        } while (i < 5);

    }

}
