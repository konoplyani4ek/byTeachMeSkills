package HomeworkKonoplyanik.HW3;

import java.util.Scanner;

public class Cycle_8 {
    public static void main(String[] args) {
        System.out.println("Enter the cash amount");
        Scanner scannercash = new Scanner(System.in);
        double cash = scannercash.nextInt();
        System.out.println("How long?");
        Scanner scannermonth = new Scanner(System.in); // кол-во месяцев
        int month = scannermonth.nextInt();
        double profit=cash; // итоговая сумма, начинается с введенного числа
         for (int x=1;x<=month;x++)
        {profit=1.07*profit;}
        System.out.println(profit);
    }
}

