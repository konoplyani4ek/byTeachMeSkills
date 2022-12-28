package HomeworkKonoplyanik.HW7.DoctorsSecond;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//get all filled clients
       Client[] clients = getClients();

        for (Client client : clients) {
            //get needed doctor
            MedicalPlan plan = client.getMedicalPlan();
            Doctor doctor = DoctorFactory.getDoctorByMedicalPlan(plan);
            doctor.greet();
            doctor.heal(client);
        }
    }

    private static Client[] getClients() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter clients quantity");
        int size = scanner.nextInt();
        Client[] clients = new Client[size];
        for (int i = 0; i < size; i++) {
            clients[i] = getClient();
        }
        return clients;
    }

    private static Client getClient() {
        Random r = new Random();
        int nextValue = r.nextInt(4);
        Client client = new Client("Fedor " + nextValue);
        MedicalPlan medicalPlan = new MedicalPlan(nextValue); // код проблемы тут
        client.setMedicalPlan(medicalPlan);
        return client;
    }
}