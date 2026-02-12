package ArrayOOP;

public class ArrayTest {

    public static void main(String[] args) {

        Array array = new Array(5); // 0, 1, 2, 3, 4 er tilgængelige indexes, men 5 er ikke, da "5" her betyder .length på array

        array.setItemInArray(0, "Bager");
        array.setItemInArray(1, "Grethe");
        array.setItemInArray(2, "Sandra");
        array.setItemInArray(3, "Mortensen");
        array.setItemInArray(4, "Ferb");

        System.out.println(array);

    }

}
