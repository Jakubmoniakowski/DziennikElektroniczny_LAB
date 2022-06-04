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
    private int id;
    private int id_nauczyciela;
    private int id_ucznia;
    private String opis;
    private String data;
    private String nazwisko;
}
