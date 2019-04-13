package kg.infoservice.mngclass.repository;

import kg.infoservice.mngclass.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByEmail(String email);

}
