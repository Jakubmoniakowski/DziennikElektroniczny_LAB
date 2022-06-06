package diary.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

import diary.model.Grade;
import diary.model.Remarks;
import diary.model.Student;

@Configuration
public class RepositoryConfiguration {
    @Bean
    GradeRepository gradeRepository(){
        return new GradeRepository(createStaticGrades());
    }

    @Bean
    RemarksRepository remarksRepository(){
        return new RemarksRepository(createStaticRemarks());
    }

    @Bean
    StudentRepository studentRepository(){
        return new StudentRepository(createStaticStudents());
    }

    private List<Grade> createStaticGrades() {
        return new ArrayList<>(List.of(new Grade(1, 2, "Polski", 24, 5, "lektura", "04.06.2022", "Mateusz", "Suska", 2)));
    }

    private List<Remarks> createStaticRemarks() {
        return new ArrayList<>(List.of(new Remarks(1, 2, 23, "Przeszkadzanie w lekcji", "24.05.2022", "Nowak")));
    }

    private List<Student> createStaticStudents() {
        return new ArrayList<>(List.of(new Student(1, "Mateusz", "Suska", "98092263452")));
    }
}
