package geekbrains;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component("doctorOffice")
@Scope("prototype")
public class DoctorOffice {
    Integer res = 0;
    Random random = new Random();


public DoctorOffice(){
    res = random.nextInt();
}


    public void doctorNamber(){
        System.out.println("кабинет врача номер №"    + res);
    }

}
