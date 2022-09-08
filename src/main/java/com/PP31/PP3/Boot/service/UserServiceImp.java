package com.PP31.PP3.Boot.service;

import com.PP31.PP3.Boot.dao.UserDAO;
import com.PP31.PP3.Boot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserDAO userDao;

    public UserServiceImp(UserDAO userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> index() {

        return userDao.index();
    }

    @Override
    public User show(int id) {
        return userDao.show(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);

    }

    @Override
    public void update(User user) {
        userDao.update(user);

    }

    @Override
    public void delete(int id) {
         userDao.delete(id);
    }
}
