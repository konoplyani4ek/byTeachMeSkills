package HomeworkKonoplyanik.HW7.DoctorsSecond;

public class DoctorFactory {
    public static Integer sum (int x,int y){
        return x*x+y;
    }
    public static Doctor getDoctorByMedicalPlan(MedicalPlan plan) {
        sum(2,1);
        if (plan.getCode() > 2) {
            return new Therapist();
        }
        if (plan.getCode() == 2){
            return new Dentist();
        }
        return new Surgeon();
    }
}
