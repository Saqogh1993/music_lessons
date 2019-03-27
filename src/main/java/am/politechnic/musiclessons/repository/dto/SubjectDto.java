package am.politechnic.musiclessons.repository.dto;

import am.politechnic.musiclessons.repository.entity.Subject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SubjectDto implements Serializable {

    private int id;
    private String title;

    public SubjectDto() {
    }

    public SubjectDto(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static List<SubjectDto> mapEntitiesToDto(List<Subject> subjects) {
        List<SubjectDto> dtos = new ArrayList<>();
        if(subjects == null)
            return dtos;

        for(Subject subject: subjects) {
            dtos.add(mapEntityToDto(subject));
        }
        return dtos;

    }

    public static SubjectDto mapEntityToDto(Subject subject) {
        if (subject == null) {
            return null;
        }

        SubjectDto subjectDto = new SubjectDto();
        subjectDto.setId(subject.getId());
        subjectDto.setTitle(subject.getTitle());

        return subjectDto;
    }

    public static Subject mapDtoToEntity(SubjectDto subjectDto){
        if (subjectDto == null) {
            return null;
        }
        Subject subject = new Subject();
        subject.setId(subjectDto.getId());
        subject.setTitle(subjectDto.getTitle());

        return new Subject();
    }
}
