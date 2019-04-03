package am.politechnic.musiclessons.repository.rep;


import am.politechnic.musiclessons.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
