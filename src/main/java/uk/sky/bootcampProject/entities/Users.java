package uk.sky.bootcampProject.entities;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Users {


// ATTRIBUTE FIELDS - INSTANCE VARIABLES

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Integer id;

    @Size(min = 2, max = 50)
    @Column(nullable = false) // NOT NULL
    private String fullName;
    @NotNull
    private String address;
    @NotNull
    private String telephoneNumber;

//    @Min(0)
//    @Max(100)
//    private int age;

    @NotNull
    private String email;

    @NotNull
    private String userName;
    @NotNull
    private String password;



    // CONSTRUCTORS


    public Users(Integer id, String fullName, String address, String telephoneNumber, String email, String userName, String password) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    //    REQUIRED


    public Users() {
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

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
