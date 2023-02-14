package uk.sky.bootcampProject.service;

import uk.sky.bootcampProject.entities.Users;

import java.util.List;

public interface ProjectService {
    Users createMember(Users details);

    List<Users> getAll();

    Users getById(int id);

    Users update(int id, String fullName, String address, Integer telephoneNumber, String email, String userName, String password);

    Users remove(int id);
}
