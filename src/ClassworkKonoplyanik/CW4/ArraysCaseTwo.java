package ClassworkKonoplyanik.CW4;

import java.util.Arrays;

public class ArraysCaseTwo {
    public static void main(String[] args) {
        char [][] arr = new char[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                if ((i+j)%2==0) {
                    arr[i][j] = 'w';
                }
                else {
                    arr[i][j] = 'b';
                }
            }
            System.out.println(Arrays.toString(arr[i]));
            }
        }
    }
