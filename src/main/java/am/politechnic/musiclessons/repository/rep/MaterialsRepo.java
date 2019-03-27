package am.politechnic.musiclessons.repository.rep;

import am.politechnic.musiclessons.repository.entity.Materials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialsRepo extends JpaRepository<Materials, Integer> {
}
