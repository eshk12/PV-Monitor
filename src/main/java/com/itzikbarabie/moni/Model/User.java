package com.itzikbarabie.moni.Model;


import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name="userID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
