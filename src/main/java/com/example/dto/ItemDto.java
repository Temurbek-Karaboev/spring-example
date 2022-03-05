package com.example.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.List;

@Data
public class ItemDto {
    private Long id;
    private String name;
    private Double price;
    @Column(name = "login", nullable = true)
    private String login;



}
