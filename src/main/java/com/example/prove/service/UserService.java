package com.example.prove.service;

import com.example.prove.model.User;
import com.example.prove.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return repository.saveAll(users);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUserById(int id) {
        return repository.findById(id).orElse(null);
    }


    public String deleteUser(int id) {
        repository.deleteById(id);
        return "user removed !! " + id;
    }

    public User updateUser(User user) {
        User existingProduct = repository.findById(user.getId()).orElse(null);
        existingProduct.setEmail(user.getEmail());
        existingProduct.setPassword(user.getPassword());
        return repository.save(existingProduct);
    }


}