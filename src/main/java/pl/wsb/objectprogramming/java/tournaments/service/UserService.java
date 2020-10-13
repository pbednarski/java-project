package pl.wsb.objectprogramming.java.tournaments.service;

import pl.wsb.objectprogramming.java.tournaments.DTO.CreateUserDTO;
import pl.wsb.objectprogramming.java.tournaments.DTO.UpdateUserDTO;
import pl.wsb.objectprogramming.java.tournaments.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<User> findAllUsers();

    User getUserById(String _id);

    User getUserByName(String userName);

    User getUserByEmail(String userEmail);

    User addUser(CreateUserDTO createUserDTO);

    User updateUser(UpdateUserDTO updateUserDTO, String uuid);

    User deleteUser(String _id);

}
