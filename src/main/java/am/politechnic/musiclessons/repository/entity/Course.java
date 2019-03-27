package am.politechnic.musiclessons.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String lecturer;
    @ManyToOne
    private Subject subject;
    private String speciality;
    private int time;

    public Course() {
    }

    public Course(String lecturer, Subject subject, String speciality, int time) {
        this.lecturer = lecturer;
        this.subject = subject;
        this.speciality = speciality;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", lecturer='" + lecturer + '\'' +
                ", subject=" + subject.getTitle() +
                ", speciality='" + speciality + '\'' +
                ", time=" + time +
                '}';
    }
}
