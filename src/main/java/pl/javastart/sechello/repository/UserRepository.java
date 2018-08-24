package pl.javastart.sechello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.sechello.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
