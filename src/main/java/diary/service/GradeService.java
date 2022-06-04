package diary.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import diary.model.Grade;
import diary.repository.GradeRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GradeService {
    private final GradeRepository gradeRepository;

    public List<Grade> getAllGradesForStudent(String studentSurname) {
        return gradeRepository
                .getGrades()
                .stream()
                .filter(grade -> grade
                        .getNazwisko()
                        .equals(studentSurname))
                .collect(Collectors.toList());
    }

    public void addGrade(int id, int id_teacher, int id_student, String description, String date, String surname, int id_subject, String subject, int grade, String name){
        gradeRepository.saveStudent(new Grade(id, id_subject, subject, id_student, grade, description, date, name, surname, id_teacher));
    }
}
