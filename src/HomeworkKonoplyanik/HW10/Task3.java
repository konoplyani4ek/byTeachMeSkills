package HomeworkKonoplyanik.HW10;

public class Task3 {
    public static void main(String[] args) {
        String [] elements = "ffff ab f 1234 jkjk".split(" "); // разделяем в массив через пробел
        String minValue = elements[0]; // считаем, что 0-вое значение самое мальнькое
        for (String element: elements) { // для каждого элемента в массиве
            if (calculateCharacters(minValue)>calculateCharacters(element)) {
                minValue=element;
            }
        }
    }
    private static int calculateCharacters(String string){
        String existentCharacters = "";
        for (char element:string.toCharArray()){
            if (!existentCharacters.contains(element + "")){
                existentCharacters +=element;
            }
        }
        return existentCharacters.length();
    }
}
