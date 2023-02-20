package uk.sky.bootcampProject.DbService;

import org.springframework.stereotype.Service;
import uk.sky.bootcampProject.DbService.ProjectService;
import uk.sky.bootcampProject.entities.User;
import uk.sky.bootcampProject.exceptions.UserNotFoundException;
import uk.sky.bootcampProject.repository.ProjectRepo;

import java.util.List;
@Service
public class ProjectServiceDB implements ProjectService {

    private ProjectRepo repo;

    public ProjectServiceDB(ProjectRepo repo) {
        this.repo = repo;
    }

    @Override
    public User createMember(User details) {
        return this.repo.save(details);
    }

    @Override
    public User getById(int id) {
        return this.repo.findById(id).orElseThrow(() -> new UserNotFoundException());
    }

    @Override
    public List<User> getAll() {
        return this.repo.findAll();
    }

    @Override
    public User update(int id, String fullName, String userName, String password, String address) {
        User editUserDetails = this.getById(id);

        if (fullName != null) editUserDetails.setFullName(fullName);
        if (userName != null) editUserDetails.setUserName(userName);
        if (password != null) editUserDetails.setPassword(password);
        if (address != null) editUserDetails.setAddress(address);

        return this.repo.save(editUserDetails);
    }

    @Override
    public User remove(int id) {
        User existing = this.getById(id);
        this.repo.deleteById(id);  // actually does the delete
        return existing;
    }


}
