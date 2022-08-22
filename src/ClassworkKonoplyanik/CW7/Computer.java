package ClassworkKonoplyanik.CW7;

public  abstract class Computer {
    public Computer(){}
    public Computer(String model){};
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) { //зачем сет гет
        this.cost = cost;  // зачем зис
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    int cost;
    String model;
    int screenSize;
}
