package HomeworkKonoplyanik.HW7.DoctorsSecond;

public class Surgeon extends Doctor{
    @Override
    public void heal(Client client) {
        System.out.println("Im cutting off smth from " + client.getName());
    }
}
