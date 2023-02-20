package uk.sky.bootcampProject.repository;


import uk.sky.bootcampProject.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
