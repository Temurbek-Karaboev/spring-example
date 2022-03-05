package com.example.dto;

import com.example.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class UserDto {
    private String login;
    private String userName;
    private String phoneNumber;

    public UserDto(User user) {
        this.login=user.getLogin();
        this.userName = user.getName();
        this.phoneNumber = user.getPhoneNumber();
    }
}
