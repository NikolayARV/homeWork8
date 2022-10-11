import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] weight = new int [3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;
        double [] fl = {1.57,7.654,9.986};
        char[] abc = {'a', 'b', 'c', 'd', 'e'};

                System.out.println("Задача 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight [i]);
            if (i != weight.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < fl.length; i++) {
            System.out.print(fl [i]);
            if (i != fl.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc [i]);
            if (i != abc.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        System.out.println("Задача 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight [i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = fl.length - 1; i >= 0; i--) {
            System.out.print(fl [i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = abc.length - 1; i >= 0; i--) {
            System.out.print(abc [i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        System.out.println("Задача 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight [i] % 2 != 0) {
                weight [i] ++;
            }
            System.out.println(weight[i]);
        }



    }
}