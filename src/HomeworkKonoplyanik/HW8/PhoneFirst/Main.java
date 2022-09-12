package HomeworkKonoplyanik.HW8.PhoneFirst;

public class Main {
    public static void main(String[] args) {
        Phone iphone = new Phone("102","iphone",100);
        Phone samsung = new Phone("103","samsung");
        Phone huawei = new Phone();
        System.out.println(iphone.model+ " " +iphone.number+ " " +iphone.weight);
        System.out.println(samsung.model+ " " +samsung.number+ " " +samsung.weight);
        System.out.println(huawei.model+ " " +huawei.number+ " " +huawei.weight);
        iphone.receiveCall("Andrew","1543");
        samsung.receiveCall("Kiryl");
        huawei.receiveCall("Vladimir");

        iphone.sendMessage("102,193,193");
    }
}
