package uk.sky.bootcampProject.rest;

import org.springframework.web.bind.annotation.*;
import uk.sky.bootcampProject.entities.Users;
import uk.sky.bootcampProject.service.ProjectService;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ProjectController {

    // the service variable is a dependency
    // @Autowired -> also injects the dependency but isn't as good as constructor injection

    private ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting() {
        return "Hello, World!";
    }

    @PostMapping("/create")
    public Users addMember(@RequestBody @Valid Users users) { // pulls member from the body of the request
        return this.service.createMember(users);
    }

    @GetMapping("/getAll")
    public List<Users> getAll() {
        return this.service.getAll();
    }


    @GetMapping("/get/{id}")
    public Users getMember(@PathVariable int id) {  //pulls id from the path (url)
        return this.service.getById(id);
    }

    @PatchMapping("/update/{id}")
    public Users updateMember(@PathVariable int id, @PathParam("name") String name, @PathParam("age") Integer age, @PathParam("email") String email) {
        return this.service.update(id, name, age, email);
    }


    @DeleteMapping("/remove/{id}")
    public Users removeMember(@PathVariable int id) {
        return this.service.remove(id);
    }





}
