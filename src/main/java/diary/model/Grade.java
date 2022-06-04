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
    private int id;
    private int id_przedmiotu;
    private String przedmiot;
    private int id_ucznia;
    private int ocena;
    private String opis;
    private String data;
    private String imie;
    private String nazwisko;
    private int id_nauczyciela;
}
