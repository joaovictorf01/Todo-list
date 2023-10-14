package com.victor.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
    private String name;
    @Column(unique = true)
    private String userName;
    private String password;
    @Id
    @GeneratedValue(generator = "UUID")

    private UUID id;
    @CreationTimestamp
    private LocalDateTime createdAt;

}