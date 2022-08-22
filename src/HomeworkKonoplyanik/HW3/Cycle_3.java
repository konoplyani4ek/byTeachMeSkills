package HomeworkKonoplyanik.HW3;

import java.util.Scanner;

public class Cycle_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i=0;i<=number;i+=1) {sum = sum + i;}
        System.out.println(sum);
    }
}
