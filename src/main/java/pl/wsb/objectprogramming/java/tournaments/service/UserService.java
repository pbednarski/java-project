package pl.wsb.objectprogramming.java.tournaments.service;

import pl.wsb.objectprogramming.java.tournaments.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    User findByUserName(String userName);
    User findByEmail(String userEmail);

    void saveOrUpdateUser(User user);
    void deleteUser(String id);

}
