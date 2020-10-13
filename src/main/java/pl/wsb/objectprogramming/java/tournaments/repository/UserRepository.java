package pl.wsb.objectprogramming.java.tournaments.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.wsb.objectprogramming.java.tournaments.model.User;

import java.util.UUID;

public interface UserRepository extends MongoRepository<User, String> {

    User findByName(String userName);

    User findByEmail(String userEmail);


}
