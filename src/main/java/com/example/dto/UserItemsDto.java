package com.example.dto;

import com.example.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class UserItemsDto {

    private String userName;
    private String phoneNumber;
    private List<ItemDto> items;

    public UserItemsDto(User user) {
        this.userName = user.getName();
        this.phoneNumber = user.getPhoneNumber();
    }
}
