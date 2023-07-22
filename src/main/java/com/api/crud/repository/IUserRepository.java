package com.api.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}
