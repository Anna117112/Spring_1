package geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("patient")
@Scope ("prototype")
public class Patient {

    private Archive archive;
    private DoctorOffice doctorOffice;



        Integer res = 0;
        Random random = new Random();

        public Patient(){

            res = random.nextInt();

        }

    public void registryVisits (){
        archive.goArchive();
        doctorOffice.doctorNamber();
        System.out.println("Новый клиент   "  + res);
       // patient.patientNamber();

    }

    public Archive getArchive() {
        return archive;
    }
@Autowired
    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    public DoctorOffice getDoctorOffice() {
        return doctorOffice;
    }
    @Autowired
    public void setDoctorOffice(DoctorOffice doctorOffice) {
        this.doctorOffice = doctorOffice;
    }



}
