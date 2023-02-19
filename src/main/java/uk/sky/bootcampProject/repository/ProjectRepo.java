package uk.sky.bootcampProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.sky.bootcampProject.entities.User;

@Repository
public interface ProjectRepo extends JpaRepository<User, Integer> {
}
