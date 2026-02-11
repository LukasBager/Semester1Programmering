package Lesson07;

public class WhileLoopMystery {

    public static void main(String[] args) {
        mysteryThree();
    }

    public static void mysteryThree() {
        int z = 2;
        while (z < 20) {
            System.out.print(z + " ");
            z *= 2;
        }
        System.out.println();
    }

}
