package HomeworkKonoplyanik.HW6;

public class FirstCreditCard {
    int account;
    int balance;
    public FirstCreditCard(int account, int balance){
        this.account = account;
        this.balance = balance;
    };
    public int getBalance() {
        return balance;
    }

    public void addBalance(int amount) {
        balance+=amount;
    }
    public void withdrawBalance (int amount) {

        if (balance>amount) {balance-=amount;}
        else {System.out.println("Your balance is too low");}

    }
    public void getInfo(){
        System.out.println("current balance is "+ getBalance());
    }
}
