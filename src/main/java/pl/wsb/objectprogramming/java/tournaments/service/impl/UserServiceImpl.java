package pl.wsb.objectprogramming.java.tournaments.service.impl;

import com.mongodb.MongoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsb.objectprogramming.java.tournaments.DTO.CreateUserDTO;
import pl.wsb.objectprogramming.java.tournaments.DTO.UpdateUserDTO;
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
    public List<User> findAllUsers() {
        if (userRepository.findAll().isEmpty()) {
            throw new MongoException("There is no record in database");
        } else {
            return userRepository.findAll();
        }
    }

    @Override
    public User getUserById(UUID _id) {
        if (userRepository.findById(_id).isPresent()) {
            return userRepository.findById(_id).get();
        } else {
            throw new MongoException("There is no record with such ID");
        }
    }

    @Override
    public User getUserByName(String userName) {
        return null;
    }

    @Override
    public User getUserByEmail(String userEmail) {
        return null;
    }

    @Override
    public User addUser(CreateUserDTO createUserDTO) {
        return null;
    }

    @Override
    public User updateUser(UpdateUserDTO updateUserDTO, UUID uuid) {
        return null;
    }

    @Override
    public User deleteUser(UUID id) {
        return null;
    }

}
