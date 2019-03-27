package am.politechnic.musiclessons.repository.rep;

import am.politechnic.musiclessons.repository.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Integer> {
}
