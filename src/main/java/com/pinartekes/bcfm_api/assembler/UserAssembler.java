package com.pinartekes.bcfm_api.assembler;

import com.pinartekes.bcfm_api.domain.User;
import com.pinartekes.bcfm_api.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserAssembler {
    public User toUser(String firstname, String lastname) {
        User user = new User();
        user.setFirstName(firstname);
        user.setLastName(lastname);
        return user;
    }

    public UserDto toUserDto(User user) {
        UserDto userDto = new UserDto(user.getFirstName(), user.getLastName());
        return userDto;
    }
}
