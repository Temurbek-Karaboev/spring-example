package com.example.entity;

import com.example.dto.ItemDto;
import com.example.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_sec")
    @SequenceGenerator(name = "user_sec", sequenceName = "user_sec", allocationSize = 1)
    private Long id;

    private String name;
    private Double price;
    @Column(name = "login", nullable = true)
    private String login;


}
