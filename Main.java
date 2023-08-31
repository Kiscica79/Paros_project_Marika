package PACKAGE_NAME; public class Main {
    public static void main(String[] args) {
        int[] array = {25,2,5,9,7,4,3};
        System.out.println("The biggest number is " + calculateMax(array));

    }

    public static int calculateMax(int[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("The array must not be null or empty.");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }

        }
        return max;
    }

}
