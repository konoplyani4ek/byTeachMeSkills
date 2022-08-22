package HomeworkKonoplyanik.HW4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//.       Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
//        Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.
//        Уточнение — массив можно заполнять целыми числами, однако среднее значение должно быть вещественного типа (float).
public class ArraysTwo {
    public static void main(String[] args) {
        System.out.println("Enter array size");
        int n = new Scanner(System.in).nextInt();
        int [] ary = new int[n];
        for (int i=0;i<n;i++){
            ary[i]= new Random().nextInt(30);
        }
        System.out.println("your array is "+Arrays.toString(ary));
        Arrays.sort(ary);
        System.out.println("your sorted array is "+Arrays.toString(ary));
        System.out.println("Min value is " +ary[0]);
        System.out.println("Max value is " +ary[n-1]);
        float av =0;
        for ( int i=0;i<n;i++){
            av=av+ary[i];
        }
        av=av/n;
        System.out.println("average value is " +av);
    }
}
