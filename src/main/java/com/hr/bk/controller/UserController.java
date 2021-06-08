package com.hr.bk.controller;

import com.hr.bk.enitiy.User;
import com.hr.bk.model.ProfileModel;
import com.hr.bk.model.SignInModel;
import com.hr.bk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/users"})
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public boolean signUp(@RequestBody User user) {
        if (userService.checkExistEmail(user.getEmail())) {
            return false;
        } else {
            userService.save(user);
            return true;
        }
    }

    @PostMapping("/signin")
    public User signIn(@RequestBody SignInModel signInModel) {
        User user = userService.findByEmail(signInModel.getEmail());
        if (user != null && signInModel.getPassword().equals(user.getPassword())) {
            return user;
        } else {
            return null;
        }
    }

    @GetMapping
    public List<User> findAll() {
        List<User> list = userService.findAll();
        return list;
    }

    @PutMapping("/{id}")
    public boolean updateUser(@PathVariable(value = "id") Integer id, @RequestBody User user) {
        User update = userService.findById(id);
        if (update != null) {
            if (user.getPassword().equals(update.getPassword())) {
                update.setId(user.getId());
                update.setAddress(user.getAddress());
                update.setPhone(user.getPhone());
                update.setName(user.getName());
                update.setEmail(user.getEmail());
                update.setStatus(user.getStatus());
            } else {
                update.setPassword(user.getPassword());
            }
            userService.save(update);
            return true;
        } else {
            return false;
        }
    }

    @PutMapping("/status/{id}")
    public boolean changeStatus(@PathVariable(value = "id") Integer id, @RequestBody User user) {
        User update = userService.findById(id);
        if (update != null) {
            update.setStatus(user.getStatus());
            userService.save(update);
            return true;
        } else {
            return false;
        }
    }

    @PostMapping("/user_profile")
    public User getUser(@RequestBody ProfileModel profileModel) {
        User user = userService.findByEmail(profileModel.getEmail());
        return user;
    }
}
