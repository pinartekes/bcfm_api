package com.pinartekes.bcfm_api.controller;

import com.pinartekes.bcfm_api.assembler.UserAssembler;
import com.pinartekes.bcfm_api.domain.User;
import com.pinartekes.bcfm_api.dto.UserDto;
import com.pinartekes.bcfm_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAssembler userAssembler;

    @RequestMapping(value = "/whoami",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDto getUser(@RequestParam(value = "firstname", defaultValue = "Pinar") String firstname,
                           @RequestParam(value = "lastname", defaultValue = "Tekes") String lastname) {

        User person = userAssembler.toUser(firstname, lastname);
        userRepository.save(person);
        UserDto userDto = userAssembler.toUserDto(person);
        return userDto;
    }
}
