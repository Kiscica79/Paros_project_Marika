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
}
