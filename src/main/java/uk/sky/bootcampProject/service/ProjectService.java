package uk.sky.bootcampProject.service;

import uk.sky.bootcampProject.entities.Member;

import java.util.List;

public interface ProjectService {
    Member createMember(Member m);

    List<Member> getAll();

    Member getById(int id);

    Member update(int id, String name, Integer age, String email);

    Member remove(int id);
}
