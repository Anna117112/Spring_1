package geekbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
//        Registry registry=new Registry();
//        Archive archive = new Archive();
//        DoctorOffice doctorOffice = new DoctorOffice();
//        registry.setArchive(archive);
//        registry.setDoctorOffice(doctorOffice);
//        registry.registryVisits();



        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       Patient patient =  context.getBean("patient", Patient.class);
        Patient patient2 =  context.getBean("patient", Patient.class);
//       // ICamera camera2 = context.getBean("camera", ICamera.class);
        // по умолчанию создается 1 обект класса. если поставить эту аантацю и слово "prototype" @Scope ("prototype")
// то будуд создаваться разные обекты patient и patient2
        patient.registryVisits();
        patient2.registryVisits();
    }
}
