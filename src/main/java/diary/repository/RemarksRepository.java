package diary.repository;

import java.util.List;

import diary.model.Remarks;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RemarksRepository {
    private final List<Remarks> remarks;

    public void saveStudent(Remarks remark) {
        remarks.add(remark);
    }
}
