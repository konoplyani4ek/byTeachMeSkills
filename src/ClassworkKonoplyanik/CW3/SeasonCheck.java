package ClassworkKonoplyanik.CW3;

import java.util.Random;

public class SeasonCheck {
    public static void main(String[] args) {
        int randomvalue = new Random().nextInt(12) + 1 ;
        System.out.println(randomvalue);
        if (randomvalue <= 2 || randomvalue ==12) {System.out.println("winter");} // логический оператор "или" ||
            else if (randomvalue <= 5) {System.out.println("spring");}
            else if (randomvalue <= 8) {System.out.println("summer");}
            else {System.out.println("autumn");}
            // else if (randomvalue >=9 && randomvalue <= 11) {System.out.println("autumn");}
            // else if (randomvalue == 12) {System.out.println("winter");}

        }
        }

