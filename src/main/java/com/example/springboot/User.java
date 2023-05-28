package com.example.springboot;

import jakarta.persistence.*;

import javax.validation.constraints.Email;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    @Column(name="username", nullable = false, unique= true)
    private String username;
    @Email
    @Column(name= "email", nullable = false, unique= true)
    private String email;
    @Column(name="password", nullable= false)
    private String password;

    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public User(){
        super();
    }

}