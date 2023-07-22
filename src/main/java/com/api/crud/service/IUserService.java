package com.api.crud.service;

import java.util.List;
import java.util.Optional;

import com.api.crud.model.User;

public interface IUserService {

    public List<User> getAll();

    public Optional<User> getById(Long id);

    public User save(User user);

    public User updateById(Long id, User user);

    public List<User> delete(Long id);
}
