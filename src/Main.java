import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
        //task7();
        //task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        //Массив 1
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        // Массив 2
        double[] two = {1.57, 7.654, 9.986};
        // массив 3
        int[] buildingFloor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public static void task2() {
        System.out.println("Задача 2");
        //Массив 1
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        for (int i = 0; i < one.length; i++) {
            if (i != 2) {
                System.out.print(one[i] + ", ");
            } else {
                System.out.print(one[i]);
                System.out.println();
            }
        }
        // Массив 2
        double[] two = {1.57, 7.654, 9.986};
        for (int i = 0; i < two.length; i++) {
            if (i != 2) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.print(two[i]);
                System.out.println();
            }
        }
        // массив 3
        int[] buildingFloor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < buildingFloor.length; i++) {
            if (i != buildingFloor.length - 1) {
                System.out.print(buildingFloor[i] + ", ");
            } else {
                System.out.print(buildingFloor[i]);
                System.out.println();
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        //Массив 1
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        for (int i = one.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(one[i] + ", ");
            } else {
                System.out.print(one[i]);
                System.out.println();
            }
        }
        // Массив 2
        double[] two = {1.57, 7.654, 9.986};
        for (int i = two.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(two[i] + ", ");
            } else {
                System.out.print(two[i]);
                System.out.println();
            }
        }
        // массив 3
        int[] buildingFloor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = buildingFloor.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(buildingFloor[i] + ", ");
            } else {
                System.out.print(buildingFloor[i]);
                System.out.println();
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        //Массив 1
        {
            System.out.println("Вариант 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
               for (int i = 0; i <= one.length - 1; i++) {
                   if (one[i] % 2 == 0)
                    System.out.print(one[i] + ", ");
                else
                    System.out.print(one[i] + 1 + ", ");
            }{
            System.out.println();}
        } {
            System.out.println("Вариант 2");
            int [] arr = {1, 2, 3};
            for (int i = 0; i <= arr.length-1; i++) {
                if ( arr [i] %2 ==0) {
                    arr [i] = arr[i];
               } else {
                    arr [i] = arr[i] +1;
                }}
                System.out.println(Arrays.toString(arr));}
        }
    }











