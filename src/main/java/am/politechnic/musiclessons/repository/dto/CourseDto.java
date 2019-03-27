package am.politechnic.musiclessons.repository.dto;

import am.politechnic.musiclessons.repository.entity.Course;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CourseDto implements Serializable {

    private int id;
    private int time;
    private String lecturer;
    private SubjectDto subjectDto;

    public CourseDto() {
    }

    public CourseDto(int id, int time, String lecturer) {
        this.id = id;
        this.time = time;
        this.lecturer = lecturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public SubjectDto getSubjectDto() {
        return subjectDto;
    }

    public void setSubjectDto(SubjectDto subjectDto) {
        this.subjectDto = subjectDto;
    }

    public static List<CourseDto> mapEntitiesToDto(List<Course> courses) {
        List<CourseDto> dtos = new ArrayList<>();
        if(courses == null)
            return dtos;

        for(Course course: courses) {
            dtos.add(mapEntityToDto(course));
        }
        return dtos;
    }

    private static CourseDto mapEntityToDto(Course course) {
        if (course == null) {
            return null;
        }

        CourseDto courseDto = new CourseDto();

        courseDto.setId(course.getId());
        courseDto.setLecturer(course.getLecturer());
        courseDto.setTime(course.getTime());
        courseDto.setSubjectDto(SubjectDto.mapEntityToDto(course.getSubject()));

        return courseDto;
    }
}
