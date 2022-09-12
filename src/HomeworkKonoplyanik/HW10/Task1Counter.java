package HomeworkKonoplyanik.HW10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1Counter {
    String string;
    public Task1Counter(String string) {
       this.string=string;
    }
    public void task1(){
        String [] subStrings = string.split("-");
        for (String element : subStrings) {
            boolean isDigital = true;
//            Integer.parseInt(element);

            for (char element2 : element.toCharArray()) {
                if (element2 < '0' || element2 > '9') { // если чар не в промежутке от 0 до 9 (не цифра)
//                    Character.isDigit(element2) - правильный вариант
                    isDigital = false;
                    break;
                }
            }
            if (isDigital)
                System.out.println(element);
        }
    }

    public void task2(){
        List <String> resulst = new ArrayList<>();
        String [] array = string.split("-");
        for (String element : array) {
            if (element.length() == 3){
                resulst.add("***");
            } else {
                resulst.add(element);
            }
        }
        System.out.println(String.join("-",resulst));
    }

    public void task3(){
        String [] subStrings = string.split("-");
        String result = "";
        for (String element : subStrings) {
           for (char subelement: element.toCharArray()) {
               if (Character.isLetter(subelement)) {
                   result+=subelement;
//                   System.out.print(subelement);
               }
           }
        }
        System.out.println(result.substring(0,3) + "/"+ result.substring(3,6) + "/"+ result.substring(6,7)+ "/" + result.substring(7));
        System.out.println(result);
        }


    public void task4() {
        String[] subStrings = string.split("-");
        StringBuilder result = new StringBuilder("");
        for (String element : subStrings) {
            for (char subelement : element.toCharArray()) {
                if (Character.isLetter(subelement)) {
                    subelement= Character.toUpperCase(subelement);
                    result.append(subelement);
//                   System.out.print(subelement);
                }
            }
        }
        System.out.println("Letter:" + result.substring(0, 3) + "/"
                + result.substring(3, 6) + "/" +
                result.substring(6, 7) + "/" + result.substring(7));
    }
    }




