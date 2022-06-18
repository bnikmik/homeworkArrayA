public class Main {
    public static void main(String[] args) {
        // Задание №1,№2

        System.out.println("Задание №1,№2");
        System.out.println(" ");

        int[] arrA = new int[3];
        arrA[0] = 1;
        arrA[1] = 2;
        arrA[2] = 3;

        double[] arrB = {1.57, 7.654, 9.987};

        char[] arrC = {38,94,33};

        for (int i = 0; i < arrA.length; i++) {
            if (i< arrA.length-1){
                System.out.print(arrA[i]+", ");
            }
            else
                System.out.println(arrA[i]);
        }

        for (int i = 0; i < arrB.length; i++) {
            if (i< arrB.length-1){
                System.out.print(arrB[i]+", ");
            }
            else
                System.out.println(arrB[i]);
        }

        for (int i = 0; i < arrC.length; i++) {
            if (i< arrC.length-1){
                System.out.print(arrC[i]+", ");
            }
            else
                System.out.println(arrC[i]);
        }

        // Задание №3
        System.out.println(" ");
        System.out.println("Задание №3");
        System.out.println(" ");

        for (int i = arrA.length - 1; i >= 0; i--) {
            if (i != 0){
                System.out.print(arrA[i]+", ");
            }
            else
                System.out.println(arrA[i]);
        }

        for (int i = arrB.length - 1; i >= 0; i--){
            if (i != 0){
                System.out.print(arrB[i]+", ");
            }
            else
                System.out.println(arrB[i]);
        }

        for (int i = arrC.length - 1; i >= 0; i--) {
            if (i != 0){
                System.out.print(arrC[i]+", ");
            }
            else
                System.out.println(arrC[i]);
        }

        // Задание №4
        System.out.println(" ");
        System.out.println("Задание №4");
        System.out.println(" ");

        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i]%2 != 0) {
                arrA[i] += 1;
                System.out.print(arrA[i]+" ");
            }
            else
                System.out.print(arrA[i]+" ");
        }
    }
}