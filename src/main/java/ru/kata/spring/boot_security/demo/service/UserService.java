package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    void upDateUser(User user);

    void deleteUser(Long id);

    User getByIdUser(Long id);

}