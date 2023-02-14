package uk.sky.bootcampProject.service;

import org.springframework.stereotype.Service;
import uk.sky.bootcampProject.entities.Users;
import uk.sky.bootcampProject.repository.ProjectRepo;

import java.util.List;
@Service
public class ProjectServiceDB implements ProjectService {

    private ProjectRepo repo;

    public ProjectServiceDB(ProjectRepo repo) {
        this.repo = repo;
    }

    @Override
    public Users createMember(Users details) {
        return this.repo.save(details);
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
    public Users update(int id, String fullName, String address, Integer telephoneNumber, String email, String userName, String password) {
        Users editUserDetails = this.getById(id);

        if (fullName != null) editUserDetails.setFullName(fullName);
        if (address != null) editUserDetails.setAddress(address);
        if (telephoneNumber != null) editUserDetails.setTelephoneNumber(telephoneNumber);
//        if (age != null) old.setAge(age);      // may decide to keep copy of a users age???
        if (email != null) editUserDetails.setEmail(email);
        if (userName != null) editUserDetails.setUserName(userName);
        if (password != null) editUserDetails.setPassword(password);

        return this.repo.save(editUserDetails);
    }

    @Override
    public Users remove(int id) {
        Users existing = this.getById(id);
        this.repo.deleteById(id);  // actually does the delete
        return existing;
    }


}
