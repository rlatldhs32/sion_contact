package ssion.ssion.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ssion.ssion.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
