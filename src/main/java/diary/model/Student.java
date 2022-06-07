package diary.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Student {
    private final int id;
    private final String name;
    private final String surname;
    private final String peselNumber;
}
