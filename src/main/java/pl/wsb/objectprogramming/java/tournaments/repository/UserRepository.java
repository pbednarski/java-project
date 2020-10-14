package pl.wsb.objectprogramming.java.tournaments.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.wsb.objectprogramming.java.tournaments.exceptions.UserNotFoundException;
import pl.wsb.objectprogramming.java.tournaments.model.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends MongoRepository<User, UUID> {

    User findByName(String userName) throws UserNotFoundException;

    User findByUserId(UUID userId) throws UserNotFoundException;

    List<User> findByEmail(String userEmail);


}
