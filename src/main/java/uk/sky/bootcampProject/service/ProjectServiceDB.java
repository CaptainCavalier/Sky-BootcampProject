package uk.sky.bootcampProject.service;

import uk.sky.bootcampProject.entities.Users;
import uk.sky.bootcampProject.persistence.ProjectRepo;

import java.util.List;

public class ProjectServiceDB implements ProjectService {

    private ProjectRepo repo;

    public ProjectServiceDB(ProjectRepo repo) {
        this.repo = repo;
    }

    @Override
    public Users createMember(Users m) {
        return this.repo.save(m);
    }

    @Override
    public Users getById(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public List<Users> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Users update(int id, String name, Integer age, String email) {
        Users old = this.getById(id);

        if (name != null) old.setFullName(name);
        if (age != null) old.setAge(age);
        if (email != null) old.setEmail(email);


        return this.repo.save(old);
    }

    @Override
    public Users remove(int id) {
        Users existing = this.getById(id);
        this.repo.deleteById(id);  // actually does the delete
        return existing;
    }


}
