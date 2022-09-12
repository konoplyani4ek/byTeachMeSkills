package HomeworkKonoplyanik.HW8.DoctorSecond;

public class DoctorFactory {

    public static Doctor getDoctorByMedicalPlan(MedicalPlan medicalPlan) {
        if (medicalPlan.getCode() > 2) {
            return new Therapist();
        }
        if (medicalPlan.getCode() == 2){
            return new Dentist();
        }
        return new Surgeon();
    }
}
