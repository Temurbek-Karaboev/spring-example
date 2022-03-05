package com.example.entity;

import com.example.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "item_sec")
    @SequenceGenerator(name = "item_sec", sequenceName = "item_sec", allocationSize = 1)
    private Long id;
    @Column(unique = true)
    private String login;
    private String name;
    @Column(name = "phone_number")
    private String phoneNumber;

    public void update(UserDto userDto){
        this.phoneNumber=userDto.getPhoneNumber();
        this.name=userDto.getUserName();
    }

}
