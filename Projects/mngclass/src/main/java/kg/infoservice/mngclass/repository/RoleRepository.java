package kg.infoservice.mngclass.repository;

import kg.infoservice.mngclass.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {

    Role findRoleByName(String name);
}
