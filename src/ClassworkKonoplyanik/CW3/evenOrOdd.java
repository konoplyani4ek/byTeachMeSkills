package ClassworkKonoplyanik.CW3;

import java.util.Random;

public class evenOrOdd {
    public static void main(String[] args) {
        int random = new Random().nextInt(); //переменная рандом генерирует int
        System.out.println(random);
        if (random % 2 == 0) {
            System.out.println("value is even");}
                    else {System.out.println("value is odd");}
        }
    }
