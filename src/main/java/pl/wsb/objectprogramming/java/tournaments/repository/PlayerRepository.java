package pl.wsb.objectprogramming.java.tournaments.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.wsb.objectprogramming.java.tournaments.model.Player;

public interface PlayerRepository extends MongoRepository<Player, String> {

    Player findByName(String name);

    Player findByLastName(String lastname);


}
