package pl.wsb.objectprogramming.java.tournaments.service;

import pl.wsb.objectprogramming.java.tournaments.dto.CreateUserDTO;
import pl.wsb.objectprogramming.java.tournaments.dto.UpdateUserDTO;
import pl.wsb.objectprogramming.java.tournaments.exceptions.UserAlreadyExistException;
import pl.wsb.objectprogramming.java.tournaments.exceptions.UserNotFoundException;
import pl.wsb.objectprogramming.java.tournaments.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<User> findAllUsers() throws UserNotFoundException;

    User getUserByName(String userName) throws UserNotFoundException;

    User getUserByEmail(String userEmail);

    User addUser(CreateUserDTO createUserDTO) throws UserAlreadyExistException, UserNotFoundException;

    User updateUser(UpdateUserDTO updateUserDTO, String uuid);

    User deleteUser(UUID userId);

}
