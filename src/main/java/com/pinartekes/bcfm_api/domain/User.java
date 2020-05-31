package com.pinartekes.bcfm_api.domain;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String firstname;

    private String lastname;

    public String getFirstName() {
        return this.firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
