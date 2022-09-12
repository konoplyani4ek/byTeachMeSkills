package HomeworkKonoplyanik.HW8.DoctorSecond;

public class Dentist extends Doctor{
    @Override
    public void heal(Client client) {
        System.out.println("Im drilling the tooth of " + client.getName());
    }
}
