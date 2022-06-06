package diary.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import diary.model.Remarks;
import diary.repository.RemarksRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RemarksService {
    private final RemarksRepository remarksRepository;

    public List<Remarks> getAllRemarksForStudent(String studentSurname) {
        return remarksRepository
                .getRemarks()
                .stream()
                .filter(remark -> remark
                        .getDescription()
                        .equals(studentSurname))
                .collect(Collectors.toList());
    }

    public void addRemark(int id, int id_teacher, int id_student, String description, String date, String surname){
        remarksRepository.saveStudent(new Remarks(id, id_teacher, id_student, description, date, surname));
    }
}
