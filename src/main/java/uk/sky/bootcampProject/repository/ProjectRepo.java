package uk.sky.bootcampProject.repository;

import org.springframework.stereotype.Repository;
import uk.sky.bootcampProject.entities.User;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProjectRepo extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
