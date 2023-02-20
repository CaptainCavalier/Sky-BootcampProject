package uk.sky.bootcampProject.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "userTable")
public class User {


// ATTRIBUTE FIELDS - INSTANCE VARIABLES



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    @Column(nullable = false, updatable = false)
    private Integer id;
    @Size(min = 2, max = 50)
    @Column(nullable = false) // NOT NULL
    private String fullName;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;

    private String address;

    @Column(nullable = false)
    private String role;


    // CONSTRUCTORS


    public User(Integer id, String fullName, String username, String password, String address, String role) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.address = address;
        this.role = role;
    }

    public User(String fullName, String username, String password, String role) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.role= role;
    }

    //    REQUIRED
    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
