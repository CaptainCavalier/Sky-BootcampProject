package uk.sky.bootcampProject.service;

import uk.sky.bootcampProject.entities.Users;

import java.util.List;

public interface ProjectService {
    Users createMember(Users m);

    List<Users> getAll();

    Users getById(int id);

    Users update(int id, String name, Integer age, String email);

    Users remove(int id);
}
