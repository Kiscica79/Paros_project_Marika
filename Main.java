package PACKAGE_NAME;

public class Main {
    public static void main(String[] args) {
        int[] array = {25, 2, 5, 9, 7, 4, 3};
        System.out.println("The biggest number is " + calculateMax(array));
        System.out.println("The number of the odd numbers: " + calculateOddNumbers(array));

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


}
