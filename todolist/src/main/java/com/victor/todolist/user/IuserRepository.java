package com.victor.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IuserRepository extends JpaRepository<UserModel, Long> {
    UserModel findByUserName(String userName);
}