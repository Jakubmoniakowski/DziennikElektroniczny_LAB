package diary.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Grade {
    // TODO zmienić nazwy pól na angielskie
    private final int id;
    private final int id_subject;
    private final String subject;
    private final int id_student;
    private final int grade;
    private final String description;
    private final String date;
    private final String name;
    private final String surname;
    private final int id_teacher;
}
