package am.politechnic.musiclessons.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String title;
    @OneToMany(mappedBy = "subject")
    private List<Materials> materialsList;

    @OneToMany(mappedBy = "subject")
    private List<Course> courses;

    public Subject() {
    }

    public Subject(String title, List<Materials> materialsList, List<Course> courses) {
        this.title = title;
        this.materialsList = materialsList;
        this.courses = courses;
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

    public List<Materials> getMaterialsList() {
        return materialsList;
    }

    public void setMaterialsList(List<Materials> materialsList) {
        this.materialsList = materialsList;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", materialsList=" + materialsList.toString() +
                ", courses=" + courses.toString() +
                '}';
    }
}
