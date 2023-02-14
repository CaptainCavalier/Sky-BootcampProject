package uk.sky.bootcampProject.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.sky.bootcampProject.entities.Users;

@Repository
public interface ProjectRepo extends JpaRepository<Users, Integer> {
}
