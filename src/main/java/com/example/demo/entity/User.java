package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String  userName;
    @Column(nullable = false)
    private String password;
    @Column(name = "full_name")
    private String fullName;
    private String phoneNumber;
    @OneToMany
    private List<Card> card;


}
