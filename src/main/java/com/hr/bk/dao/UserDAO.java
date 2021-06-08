package com.hr.bk.dao;

import com.hr.bk.enitiy.User;

import java.util.List;

public interface UserDAO {
    User save(User user);

    User findByEmail(String email);

    boolean checkExistEmail(String email);

    List<User> findAll();

    User findById(int id);
}
