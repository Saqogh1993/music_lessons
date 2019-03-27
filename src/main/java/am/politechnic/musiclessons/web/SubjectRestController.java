package am.politechnic.musiclessons.web;

import am.politechnic.musiclessons.repository.dto.SubjectDto;
import am.politechnic.musiclessons.repository.entity.Subject;
import am.politechnic.musiclessons.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectRestController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjects")
    public List<SubjectDto> findAllSubjects() {
        return SubjectDto.mapEntitiesToDto(subjectService.findAllSubjects());
    }
}
