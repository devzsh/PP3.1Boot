package com.PP31.PP3.Boot.service;

import com.PP31.PP3.Boot.model.User;


import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(User user);
    void delete (int id);

}
