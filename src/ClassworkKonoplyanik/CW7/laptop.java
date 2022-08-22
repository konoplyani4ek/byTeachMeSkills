package ClassworkKonoplyanik.CW7;

public class laptop extends Computer {
    int batteryLife;
    public laptop(int batteryLife){
        super("My default model"); //аналог this
        this.batteryLife=batteryLife;
    }

}
