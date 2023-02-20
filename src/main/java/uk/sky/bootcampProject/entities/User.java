package uk.sky.bootcampProject.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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
    private String userName;
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String role;


    // CONSTRUCTORS


    public User(Integer id, String fullName, String userName, String password, String address, String role) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.address = address;
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
