package HomeworkKonoplyanik.HW4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysOne {

//    Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
//    Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
//    В результате должен быть новый массив без указанного числа.
//        (более простой вариант — вместо удаления делать значение равным 0,
//    более сложный вариант — создавать новый массив меньшего размера и заполнять его только необходимыми числами).

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            int random = new Random().nextInt(30);
            array[i] = random;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("enter your number");
        int scanned = new Scanner(System.in).nextInt();
        int n = 0; //кол-во значений в новом массиве
        int y = 0; // для   подсчета индекса в новом массиве
            for (int i = 0; i < array.length; i++) {
                if (array[i] != scanned) {
                    n++;
                }
            }
        int [] arrayNew = new int[n];
        for (int i = 0; i < 20; i++) {
            if (array[i] != scanned) {
                arrayNew[y]=array[i];
                y++;
            }
                                    }

            System.out.println(Arrays.toString(arrayNew));
        }
    }