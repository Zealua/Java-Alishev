package com.example.demo;

import java.util.List;

public interface UsersService  {

    public List<User> getUsers();

    public void addUser(String userName);

    public  void removeUser(int userId);
}
