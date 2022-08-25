package Registr;

public class MainClass {
    public static void main(String[] args) {
      Register register = new Register(10);

      register.addDocument(new Contract());
      register.printDocument();

      register.addDocument(new FinanceDocument());
      register.printDocument();
    }
}
