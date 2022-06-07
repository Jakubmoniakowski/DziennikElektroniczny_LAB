package diary.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import diary.model.Student;
import diary.repository.StudentRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getStudentByPesel(String studentPesel) {
        return studentRepository
                .getStudents()
                .stream()
                .filter(pesel -> pesel
                        .getPeselNumber()
                        .equals(studentPesel))
                .collect(Collectors.toList());
    }

    public List<Student> getAllStudents() {
        return studentRepository.getStudents();
    }

    public void addStudent(int id, String surname, String name, String pesel){
        studentRepository.saveStudent(new Student(id, name, surname, pesel));
    }
}
