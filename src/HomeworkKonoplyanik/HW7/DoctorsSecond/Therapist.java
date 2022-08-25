package HomeworkKonoplyanik.HW7.DoctorsSecond;

public class Therapist  extends Doctor{

    @Override
    public void heal(Client client) {
        System.out.println("Im trying to cure the client "+client.getName());
    }
}
