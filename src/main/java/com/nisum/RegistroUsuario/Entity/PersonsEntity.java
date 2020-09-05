package com.nisum.RegistroUsuario.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Users")
public class PersonsEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 100)
    private long id;

    @Column(name = "userid", nullable = false, length = 100)
    private String userid;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "email", nullable = false, length = 40)
    private String email;

    @Column(name = "password", nullable = false, length = 17)
    private String password;

    @Column(name = "number", nullable = false, length = 7)
    private int number;

    @Column(name = "citycode", nullable = false, length = 1)
    private int citycode;

    @Column(name = "contrycode", nullable = false, length = 2)
    private int contrycode;

    @Column(name = "created", nullable = false, length = 8)
    private Date created;

    @Column(name = "modified", nullable = false, length = 8)
    private Date modified;

    @Column(name = "last_login", nullable = false, length = 8)
    private Date last_login;

    @Column(name = "isactive", nullable = false, length = 20)
    private String isactive;

    public Date getCreated() {
        return new Date(created.getTime());
    }

    public void setCreated(Date created) {
        this.created = new Date(created.getTime());
    }

    public Date getModified() {
        return new Date(modified.getTime());
    }

    public void setModified(Date modified) {
        this.modified = new Date(modified.getTime());
    }

    public Date getLast_login() {
        return new Date(last_login.getTime());
    }

    public void setLast_login(Date last_login) {
        this.last_login = new Date(last_login.getTime());
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCitycode() {
        return citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public int getContrycode() {
        return contrycode;
    }

    public void setContrycode(int contrycode) {
        this.contrycode = contrycode;
    }
}
