import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // task 1
        int[] myArray_1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(replaceArray(myArray_1)) + " Task 1");

        // task 2
        int[] myArray_2 = new int[8];
        System.out.println(Arrays.toString(fillArray(myArray_2)) + " Task 2");

        // task 3
        int[] myArray_3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplyArray(myArray_3)) + " Task 3");

        // task 4
        int[][] myArray_4 = new int[3][3];
        multiArrayFill(myArray_4);

        //task 5
        int[] myArray_5 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(maxNumber(myArray_5) + " - Max number , Task - 5");

        //task 6
        Scanner scanner = new Scanner(System.in);
        int[] myArray_6 = new int[5];
        System.out.println("5 elements of Array: ");
        for (int i = 0; i < myArray_6.length; i++) {
            myArray_6[i] = scanner.nextInt();
        }
        System.out.println(checkBalance(myArray_6));

        //task 7 next time

    }

    static int[] replaceArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }
        return array;
    }

    static int[] fillArray(int[] myArray_2) {
        int count = 0;
        for (int i = 0; i < myArray_2.length - 1; i++, myArray_2[i] = count) {
            count += 3;
        }
        return myArray_2;
    }

    static int[] multiplyArray(int[] myArray_3) {
        for (int i = 0; i < myArray_3.length; i++) {
            myArray_3[i] = myArray_3[i] < 6 ? myArray_3[i] * 2 : myArray_3[i];
        }
        return myArray_3;
    }

    static void multiArrayFill(int[][] myArray_4) {
        for (int i = 0; i < myArray_4.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    myArray_4[i][j] = 1;
                } else if (i == 0 && j == 2 || i == 2 && j == 0) {
                    myArray_4[i][j] = 1;
                }
                System.out.print(myArray_4[i][j] + " ");
            }
            System.out.print(" Task 4");
            System.out.println(" ");
        }

    }

    static int maxNumber(int[] array) {
        int max;
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static boolean checkBalance(int[] array) {
        return array[0] + array[1] + array[2] == array[3] + array[4];
    }


}
