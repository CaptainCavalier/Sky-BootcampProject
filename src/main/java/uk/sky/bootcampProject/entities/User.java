package uk.sky.bootcampProject.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {


// ATTRIBUTE FIELDS - INSTANCE VARIABLES

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Integer id;
    @Size(min = 2, max = 50)
    @Column(nullable = false) // NOT NULL
    private String fullName;
    @NotNull
    private String userName;
    @NotNull
    private String password;


    // CONSTRUCTORS


    public User(Integer id, String fullName, String userName, String password) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
