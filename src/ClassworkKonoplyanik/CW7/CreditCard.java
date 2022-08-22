package ClassworkKonoplyanik.CW7;

public class CreditCard {

    private String account;

    @Override
    public String toString() {
        return "ClassworkKonoplyanik.CW7.CreditCard{" +
                "account='" + account + '\'' +
                ", amount=" + amount +
                '}';
    }

    private int amount;

    public void addMoney(int value){
        amount=amount+value;
    }
    public void takeMoney(int value) {
        if (amount >= value) {
            amount -= value;
        }
    }
}
