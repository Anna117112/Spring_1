package geekbrains;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component("archive")
// по умолчанию создается 1 обект класса. если поставить эту аантацю и слово "prototype" @Scope ("prototype")
// то будуд создаваться разные обекты
@Scope ("prototype")
public class Archive {
    Integer res = 0;
    Random random = new Random();


    public Archive(){
        res = random.nextInt();
    }
    public void goArchive() {

        System.out.println("карточка пациента №"  +res);
    }
}
