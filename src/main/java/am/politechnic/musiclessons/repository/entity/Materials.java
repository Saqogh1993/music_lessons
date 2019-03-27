package am.politechnic.musiclessons.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "materials")
public class Materials {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    private Subject subject;
    private String title;

    @ManyToOne
    private Type type;
    private String text;

    public Materials() {
    }

    public Materials(Subject subject, String title, Type type, String text) {
        this.subject = subject;
        this.title = title;
        this.type = type;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Materials{" +
                "id=" + id +
                ", subject=" + subject.getTitle() +
                ", title='" + title + '\'' +
                ", type=" + type.getTitle() +
                ", text='" + text + '\'' +
                '}';
    }


}
