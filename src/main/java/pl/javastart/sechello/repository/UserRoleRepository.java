package pl.javastart.sechello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.sechello.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
