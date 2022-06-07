package diary.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Remarks {
    private final int id;
    private final int id_teacher;
    private final int id_student;
    private final String description;
    private final String date;
    private final String surname;
}
