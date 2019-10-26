package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

class UsersServiceImpl implements UsersService {

    private UsersDaoJdbc usersDao;

    public void setUsersDao(UsersDaoJdbc usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public List<User> getUsers() {
        return usersDao.getUsers();
    }

    @Override
    public void addUser(String userName){
        usersDao.addUser(userName);
    };

    @Override
    public  void removeUser(int userId) {
        usersDao.removeUser(userId);
    }
}