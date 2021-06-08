package com.hr.bk.model;

import com.hr.bk.enitiy.User;
import com.hr.bk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements ApplicationRunner {

    @Autowired
    UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        addAdmin("HN", "admin@gmail.com", "admin", "123456", "0999999999", 2);
    }

    private void addAdmin(String address, String email, String name, String password, String phone, int status) {
        User user = new User();
        user.setAddress(address);
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);
        user.setPhone(phone);
        user.setStatus(status);
        if (userService.checkExistEmail(email)) {
            return;
        } else {
            userService.save(user);
        }
    }
}
