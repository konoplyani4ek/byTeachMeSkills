package ClassworkKonoplyanik.CW3;

import java.util.Random;

public class SeasonCheckSwitchCase {
    public static void main(String[] args) {
        int randomvalue = new Random().nextInt(12) + 1 ;
        System.out.println(randomvalue);
        switch (randomvalue)
        {case 1,2,12: System.out.println("winter"); //если значение randomvalue 1 или 2 или 12 то саут зима
            break;
            case 3,4,5: System.out.println("spring");
            break;
            case 6,7,8: System.out.println("summer");
            break;
            case 9,10,11: System.out.println("autumn");
            break;}
        }
        }

