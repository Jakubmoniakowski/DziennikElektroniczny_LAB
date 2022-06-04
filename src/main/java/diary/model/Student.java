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
    // TODO zmienić nazwy pól na angielskie
    private final int id;
    private final String imie;
    private final String nazwisko;
    private final String pesel;
}
