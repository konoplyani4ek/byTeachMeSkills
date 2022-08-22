package HomeworkKonoplyanik.HW4;
//3. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
//        Посчитайте среднее арифметическое (float) элементов каждого массива и сообщите,
//        для какого из массивов это значение оказалось больше \
import java.util.Arrays;
import java.util.Random;

public class ArraysThree {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = new Random().nextInt(30);
            arr2[i] = new Random().nextInt(30);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int j1 =0;
        int j2 =0;

        for (int i = 0; i < 5; i++) {
            j1+=arr1[i];
            j2+=arr2[i];
        }
        j1=j1/5;
        j2=j2/5;
        System.out.println("j1 "+j1+" j2 "+j2);
        if (j1>j2) {
            System.out.println("average of 1st array is bigger");
        }
        else if (j1<j2) {
            System.out.println("average of 2nd array is bigger");
        }
        else System.out.println("avergaes are equal");
    }
}