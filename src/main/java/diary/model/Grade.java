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
    private final int id_przedmiotu;
    private final String przedmiot;
    private final int id_ucznia;
    private final int ocena;
    private final String opis;
    private final String data;
    private final String imie;
    private final String nazwisko;
    private final int id_nauczyciela;
}
