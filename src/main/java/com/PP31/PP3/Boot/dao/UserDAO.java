package com.PP31.PP3.Boot.dao;

import com.PP31.PP3.Boot.model.User;


import java.util.List;

public interface UserDAO {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(User user);
    void delete (int id);
}
