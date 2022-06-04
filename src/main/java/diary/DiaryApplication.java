package diary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import diary.printers.MainPrinter;

@SpringBootApplication
public class DiaryApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DiaryApplication.class, args);
        MainPrinter bean = run.getBean(MainPrinter.class);
        bean.printWelcome();
    }
}
