package diary.printers;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import diary.model.Student;
import diary.service.GradeService;
import diary.service.RemarksService;
import diary.service.StudentService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MainPrinter {
    public void printWelcome() {
        System.out.println("Witamy w dzienniku elektronicznym!");
    }

    private final Scanner scanner = new Scanner(System.in);
    private final StudentService studentService;
    private final GradeService gradeService;
    private final RemarksService remarksService;

    public void process() {
        System.out.println("Witamy w dzienniku elektroniczym");
        int input;
        do {
            printMenu();
            input = processUserInput();
        } while (input != 4);
    }

    private int processUserInput() {
        int input;
        input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                printStudents();
                processDetails();
                break;
            case 2:
                processRemarkOption();
                break;
            case 3:
                processGradeOption();
                break;
            case 4:
                break;
            default:
                System.out.println("Sorry you picked wrong option!");
        }
        return input;
    }

    private void processDetails() {
        System.out.println("Chcesz wyświetlić oceny i uwagi ucznia? (Podaj nazwisko bądź N)");
        String input = scanner.nextLine();
        if(!input.equals("N")){
            printDetails(input);
        }
    }


    private void processGradeOption() {
        System.out.println("Dla którego ucznia chcesz dodać ocenę? (Podaj nazwisko)");
        String surname = scanner.nextLine();
        System.out.print("Podaj ocenę: ");
        int grade = scanner.nextInt();
        System.out.print("Podaj opis: ");
        String description = scanner.nextLine();
        // TODO dodać wpisywanie reszty danych i wrzucić je do metodki na dole:
//        gradeService.addGrade();
    }

    private void processRemarkOption() {
        System.out.println("Któremu uczniowi chcesz wpisać uwagę?");
        printStudents();
        String surname = scanner.nextLine();
        System.out.print("Podaj opis: ");
        String comment = scanner.nextLine();
        System.out.print("Podaj email: ");
        String email = scanner.nextLine();
        // TODO dodać wpisywanie reszty danych i wrzucić je do metodki na dole:
//        remarksService.addRemark(comment, email, surname);
    }

    private void printStudents() {
        List<String> students = studentService
                .getAllStudents()
                .stream()
                .map(Student::toString)
                .collect(Collectors.toList());

        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    private void printDetails(String input) {
        System.out.println("Oceny ucznia: ");
        gradeService.getAllGradesForStudent(input).forEach(System.out::println);
        System.out.println("Uwagi ucznia: ");
        remarksService.getAllRemarksForStudent(input).forEach(System.out::println);
    }

    private void printMenu() {
        System.out.println("Co chcesz zrobić? ");
        System.out.println("1. Wyświetl studentów");
        System.out.println("2. Dodaj uwagę");
        System.out.println("3. Dodaj ocenę");
        System.out.println("4. Wyjdź");
    }
}
