package am.politechnic.musiclessons.repository.rep;

import am.politechnic.musiclessons.repository.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {
}
