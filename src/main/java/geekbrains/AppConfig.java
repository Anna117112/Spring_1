package geekbrains;

import org.springframework.context.annotation.ComponentScan;
// позволяет создавать обект класса через бины нужно указать эту аннатацию у каждого класса
//@Configuration
// сканирует всю папку где  мы работаем на поиск компанентов для создания бика создает автомат
@ComponentScan
public class AppConfig {
//    @Bean(name = "archive")
//    public Archive archive (){
//        return new Archive ();
//    }
//
//
//    @Bean(name = "doctorOffice")
//    public DoctorOffice doctorOffice(){
//        return new DoctorOffice();
//    }
//    @Bean(name = "registry")
//    public Registry registry(){
//        return new Registry();
//
//    }
}
