package ClassworkKonoplyanik.CW4;

import java.util.Arrays;

public class ArraysCase {
    public static void main(String[] args) {
        int counter = 0;
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ++counter;
                }  System.out.println(Arrays.toString(arr[i]));
            }

        }
}
