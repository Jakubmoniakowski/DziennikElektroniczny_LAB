package diary.repository;

import java.util.List;

import diary.model.Grade;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GradeRepository {
    private final List<Grade> grades;

    public void saveStudent(Grade grade) {
        grades.add(grade);
    }
}
