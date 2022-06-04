package diary.printers;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MainPrinter {
    public void printWelcome() {
        System.out.println("Witamy w dzienniku elektronicznym!");
    }
}
