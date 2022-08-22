package HomeworkKonoplyanik.HW3;

import java.util.Scanner;

public class TemperatureScanner_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the temperature today?");
        int temperature = scanner.nextInt();
        if (temperature >= -5) {System.out.println("It's warm");}
        else if (temperature <= -10) {System.out.println("It's freezing cold");}
        else if (temperature <= -5 && temperature >= -10) {System.out.println("It's cold");}
    }
}
