package uk.sky.bootcampProject.entities;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Member {


// ATTRIBUTE FIELDS - INSTANCE VARIABLES

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Integer id;

    @Size(min = 2, max = 50)
    @Column(nullable = false) // NOT NULL
    private String name;

    @Min(0)
    @Max(100)
    private int age;

    @NotNull
    private String email;



    // CONSTRUCTORS
    public Member(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    //    REQUIRED
    public Member() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
