package com.pinartekes.bcfm_api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {

    private String firstname;
    private String lastname;

    public UserDto(String firstname, String lastname) {

        this.firstname = firstname;
        this.lastname = lastname;
    }


    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

}
