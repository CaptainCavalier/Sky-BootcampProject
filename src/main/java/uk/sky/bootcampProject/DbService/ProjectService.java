package uk.sky.bootcampProject.DbService;

import uk.sky.bootcampProject.entities.User;

import java.util.List;

public interface ProjectService {
    User createMember(User details);

    List<User> getAll();

    User getById(int id);

    User update(int id, String fullName, String userName, String password, String address);

    User remove(int id);
}
