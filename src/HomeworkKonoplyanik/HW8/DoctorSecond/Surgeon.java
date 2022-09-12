package HomeworkKonoplyanik.HW8.DoctorSecond;

public class Surgeon extends Doctor{
    @Override
    public void heal(Client client) {
        System.out.println("Im cutting off smth from " + client.getName());
    }
}
