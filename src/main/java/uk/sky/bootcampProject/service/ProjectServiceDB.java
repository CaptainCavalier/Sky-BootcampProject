package uk.sky.bootcampProject.service;

import uk.sky.bootcampProject.entities.Member;
import uk.sky.bootcampProject.persistence.ProjectRepo;

import java.util.List;

public class ProjectServiceDB implements ProjectService {

    private ProjectRepo repo;

    public ProjectServiceDB(ProjectRepo repo) {
        this.repo = repo;
    }

    @Override
    public Member createMember(Member m) {
        return this.repo.save(m);
    }

    @Override
    public Member getById(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public List<Member> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Member update(int id, String name, Integer age, String email) {
        Member old = this.getById(id);

        if (name != null) old.setName(name);
        if (age != null) old.setAge(age);
        if (email != null) old.setEmail(email);


        return this.repo.save(old);
    }

    @Override
    public Member remove(int id) {
        Member existing = this.getById(id);
        this.repo.deleteById(id);  // actually does the delete
        return existing;
    }


}
