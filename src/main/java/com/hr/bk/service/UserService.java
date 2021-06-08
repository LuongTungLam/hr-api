package com.hr.bk.service;

import com.hr.bk.enitiy.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User findByEmail(String email);

    boolean checkExistEmail(String email);

    List<User> findAll();

    User findById(int id);
}
