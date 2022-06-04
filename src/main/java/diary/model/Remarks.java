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
    // TODO zmienić nazwy pól na angielskie
    private final int id;
    private final int id_nauczyciela;
    private final int id_ucznia;
    private final String opis;
    private final String data;
    private final String nazwisko;
}
