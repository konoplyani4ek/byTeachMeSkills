package HomeworkKonoplyanik.HW6;

public class CreditCard {
    int account;
    int balance;

    public int getBalance() {
        return balance;
    }

    public void addBalance(int amount) {
        balance+=amount;
    }
    public void withdrawBalance (int amount) {
        balance-=amount;
    }
    public void getInfo(int account){
        System.out.println("current balance is "+ getBalance());
    }
}
