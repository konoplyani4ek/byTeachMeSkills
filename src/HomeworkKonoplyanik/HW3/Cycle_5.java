package HomeworkKonoplyanik.HW3;

import java.util.Random;
import java.util.Scanner;

public class Cycle_5 {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        System.out.println(value);
        System.out.println("guess the number in 10 attempts");
        Scanner scanner = new Scanner(System.in);

        for (int t=1;t<=10;t+=1) //t - try attempts
            { int scanned = scanner.nextInt();
                if (scanned == value) { System.out.println("you are right");
                break;}
                else if (scanned > value) { System.out.println("value is lower. You have "+ (10-t) +" tries left");}
                else if (scanned < value) { System.out.println("value is higher You have "+ (10-t) +" tries left");}
            }
    }
} // Написать программу которая загадывает число и предлагает вам его угадать (можно указать максимальное количество попыток
