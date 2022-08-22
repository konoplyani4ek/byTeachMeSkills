package HomeworkKonoplyanik.HW5;
//1. Создать трехмерный массив из целых чисел.
//        С помощью циклов "пройти" по всему массиву и увеличить каждый
//        элемент на заданное число. Пусть число, на которое будет
//        увеличиваться каждый элемент, задается из консоли.

import java.util.Random;
import java.util.Scanner;

public class ArraysFirst {
    public static void main(String[] args) {
        int [][][] arr = new int[5][5][5];
        int a = new Scanner(System.in).nextInt(); //заданное число
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                for (int k=0;k<5;k++){
                    arr[i][j][k] = new Random().nextInt(10);
                }
            }
        }



    }
}
