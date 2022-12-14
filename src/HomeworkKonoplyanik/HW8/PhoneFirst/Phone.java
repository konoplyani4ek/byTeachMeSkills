package HomeworkKonoplyanik.HW8.PhoneFirst;

public class Phone {
    String number;
    String model;
    int weight;
    public Phone(String number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){
        this ("invalid number", "invalid model");
    }
    public void receiveCall(String name) {
        System.out.println("Calling " +name);
    }
    public void receiveCall(String name,String phoneNumber){
        System.out.println("Calling " +name + " from the number " +phoneNumber);
    }
    public void sendMessage(String ... numbers){
        for (String number : numbers) {
            System.out.println("Sending message to "+number);
        }


    }
    public String getNumber() {
        return number;
    }

}
