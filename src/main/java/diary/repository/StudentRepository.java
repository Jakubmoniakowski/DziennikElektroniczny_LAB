package diary.repository;

import java.util.List;

import diary.model.Student;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class StudentRepository {
    private final List<Student> students;

    public void saveStudent(Student student) {
        students.add(student);
    }
}
