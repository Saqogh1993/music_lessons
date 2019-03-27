package am.politechnic.musiclessons.repository.rep;

import am.politechnic.musiclessons.repository.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepo extends JpaRepository<Type, Integer> {
}
