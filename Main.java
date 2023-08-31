package PACKAGE_NAME;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] tomb = new int[20];
        Random random = new Random();

        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = random.nextInt(100) + 1;
        }

        System.out.println("A tömb elemei:");
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + ", ");
        }
        System.out.println();

        int[] tomb2 = {5, 2, 9, 1, 7, 3, 8, 4, 6};
        int minimum = arrayMinimum(tomb2);
        System.out.println("A tömb minimuma: " + minimum);



        int[] array = {25, 2, 5, 9, 7, 4, 3};
        System.out.println("The biggest number is " + calculateMax(array));
        System.out.println("The number of the odd numbers: " + calculateOddNumbers(array));
        System.out.println("The sum is " + calculateSumEvenNumber(array));

    }

    public static int calculateMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The array must not be null or empty.");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    public static int calculateOddNumbers(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The array must not be null or empty.");
        }
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;

    }

    public static int arrayMinimum(int[] tomb) {
        if (tomb.length == 0) {
            throw new IllegalArgumentException("A tömb üres!");
        }

        int minNumber = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] < minNumber) {
                minNumber = tomb[i];
            }
        }
        return minNumber;
    }

    public static int calculateSumEvenNumber(int[] array){
        if(array.length == 0){
            throw new IllegalArgumentException("The array must not be null or empty.");
        }
        int evenSum = 0;
        for(int num : array){
            if(num % 2 == 0){
                evenSum += num;
            }

        }
        return evenSum;
    }

}
