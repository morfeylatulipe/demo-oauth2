package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_role")
@Data
public class Role extends BaseEntity {

    @Column(name = "name")
    private String name;
}
