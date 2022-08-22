package ClassworkKonoplyanik.CW4;

import java.util.Arrays;

public class ArraysSecond {
    public static void main(String[] args) {

        int[][] arr = new int[4][];  // первое число - кол-во массивов. 4 строки вниз
        // int [] [] arr1 = {{1,2},{3,4}}
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4]; // создает лесенку из массивов
        for (int i = 0; i < arr.length; i++) {  //
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j; // заполнение каждой ячейки ряда
            }

        }
        System.out.println(Arrays.deepToString(arr));

//    int[][] arr3 = new int[3][];
//    Arrays.deepToString(arr3); // упорядочивает вывод массива  ctrl+b - вывод подсказки по методу
//        Arrays.fill(arr3[0],10);  // заполняет десятками
//        Arrays.toString((arr3[0]); //выводит как строку
}
}