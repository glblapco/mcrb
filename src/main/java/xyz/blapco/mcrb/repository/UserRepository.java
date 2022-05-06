package xyz.blapco.mcrb.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.blapco.mcrb.model.User;

public interface UserRepository extends CrudRepository<User, String> {
    User findbyUsername(String username);
}
