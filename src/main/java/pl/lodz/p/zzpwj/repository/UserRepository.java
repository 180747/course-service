package pl.lodz.p.zzpwj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lodz.p.zzpwj.bus.User;

/**
 * Created by Marcin Wróbel on 17.06.17.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(String email);
    User findUserByFirstNameAndLastName(String firstName, String lastName);


}
