package Registr;

public class Register {
    private int position;
    private final Document[] arr;

    public Register(int size) {
        position=0;
        arr = new Document[size];
    }
    public void addDocument(Document document){
        if (position<arr.length) {
            arr[position] = document;
            position++;
        }
    }
    public void printDocument(){
        for (int i = 0; i < position; i++) {
            arr[i].print();
        }
    }
}
