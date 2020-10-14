package pl.wsb.objectprogramming.java.tournaments.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsb.objectprogramming.java.tournaments.dto.CreateUserDTO;
import pl.wsb.objectprogramming.java.tournaments.dto.UpdateUserDTO;
import pl.wsb.objectprogramming.java.tournaments.exceptions.UserAlreadyExistException;
import pl.wsb.objectprogramming.java.tournaments.exceptions.UserNotFoundException;
import pl.wsb.objectprogramming.java.tournaments.model.User;
import pl.wsb.objectprogramming.java.tournaments.repository.UserRepository;
import pl.wsb.objectprogramming.java.tournaments.service.UserService;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers() throws UserNotFoundException {
        List<User> usersList = userRepository.findAll();

        if (usersList.isEmpty()) {
            throw new UserNotFoundException("There is no records in database");
        } else {
            return usersList;
        }
    }

    @Override
    public User getUserByName(String userName) throws UserNotFoundException {

        User user = userRepository.findByName(userName);

        if (user == null) {
            throw new UserNotFoundException("There is no user with such NAME");
        } else {
            return user;
        }
    }

    @Override
    public List<User> getUserByEmail(String userEmail) throws UserNotFoundException {
        List<User> userList = userRepository.findByEmail(userEmail);

        if (userList.isEmpty()) {
            throw new UserNotFoundException("There is no user with such EMAIL");
        } else {
            return userList;
        }

    }

    @Override
    public User addUser(CreateUserDTO createUserDTO) throws UserAlreadyExistException, UserNotFoundException {
        User user = userRepository.findByName(createUserDTO.getName());

        if (user == null) {
            return userRepository.save(new User(createUserDTO.getName(), createUserDTO.getEmail(), createUserDTO.getDateOfBirth(), createUserDTO.getPassword()));
        } else {
            throw new UserAlreadyExistException("User already exist");
        }
    }

    @Override
    public User updateUser(UpdateUserDTO updateUserDTO, String uuid) {
        return null;
    }

    @Override
    public User deleteUser(UUID userId) throws UserNotFoundException {
        User user = userRepository.findByUserId(userId);

        if (user != null) {
            userRepository.deleteById(userId);
            return user;
        } else {
            throw new UserNotFoundException("There is no user with such ID");
        }
    }

}
