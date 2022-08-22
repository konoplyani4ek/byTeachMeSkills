package HomeworkKonoplyanik.HW4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
//        входит ли заданное число в массив или нет.
//        Пусть число для поиска задается с консоли (класс Scanner).
public class ArraysZero {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            int random = new Random().nextInt(30);
            array[i] = random;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("enter your number");
        int matches = 0;
        int scanner = new Scanner(System.in).nextInt();
        for (int i = 0; i < 20; i++) {
            if (array[i] == scanner) {
                matches++;
            }
            }
           if (matches>0) {System.out.println("total matches " + matches);}
           else {System.out.println("no matches");}
        }
    }