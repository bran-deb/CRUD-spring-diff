package com.api.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.model.User;
import com.api.crud.repository.IUserRepository;

@Service
public class UserServiceImp implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    public UserServiceImp() {
    }

    public UserServiceImp(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateById(Long id, User user) {
        User userUpdate = userRepository.findById(id).get();

        userUpdate.setFirstName(user.getFirstName());
        userUpdate.setLastName(user.getLastName());
        userUpdate.setEmail(user.getEmail());
        userRepository.save(userUpdate);
        return userUpdate;
    }

    @Override
    public List<User> delete(Long id) {
        try {
            userRepository.deleteById(id);

        } catch (Exception e) {
            return null;
        }
        return userRepository.findAll();
    }
}
