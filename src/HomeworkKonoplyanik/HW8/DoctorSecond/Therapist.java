package HomeworkKonoplyanik.HW8.DoctorSecond;

public class Therapist  extends Doctor{

    @Override
    public void heal(Client client) {
        System.out.println("Im trying to cure the client "+client.getName());
    }
}
