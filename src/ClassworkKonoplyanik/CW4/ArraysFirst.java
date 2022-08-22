package ClassworkKonoplyanik.CW4;

import java.util.Arrays;


public class ArraysFirst {
    public static void main(String[] args) {  //  объявленный массив строк размера 0 ддля параметров запуска
        int[] arr = new int[2]; // создание массива на два числа - arr[0], arr[1]
        int[] arr1 = new int[]{1,2}; // массив на два числа 1 и 2
        int[] arr3 = {1, 1}; // сокращенная форма массива на два числа 1 и 1
        int[] arr2 = new int[3];
        System.out.println(arr1[0]); // выведет нулевое (первое) число из массива)
        arr1[1] = 3; // заменит первое (второе) число из массива ( 2 на 3)
        System.out.println(arr1[1]);
        System.out.println("arr length:" + arr1.length); // кол-во чисчёел в массиве
        for (int i = 0;i< arr1.length;i++) {
            arr1[i] = 2*i;// каждый элемент массива получает значение 2i (каждое четное число)
            System.out.println("arr1[" + i + "] = " +arr1[i]);
        }
        Arrays.sort(arr1); // сортирует и выводит от нулевого значения
        System.arraycopy(arr3,1, arr2,1,1); // ???

        for (int element : arr2){
            System.out.println(element);
        }
//       // public static int fib(int position){ // рекурсия??? не спешить изучать.  для изучения сортировки
//            if (position==0){
//                return 0;
//            }
//            if (position==1){
//                return 1;
//            }
//            return fib(position-1) + fib(position-2);
        }

    }
