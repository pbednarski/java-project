package pl.wsb.objectprogramming.java.tournaments.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsb.objectprogramming.java.tournaments.model.Player;
import pl.wsb.objectprogramming.java.tournaments.repository.PlayerRepository;
import pl.wsb.objectprogramming.java.tournaments.service.PlayerService;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> findAllPlayers() throws Exception {
        return playerRepository.findAll();
    }

    @Override
    public Player findByPlayerName(String name) throws Exception {
        return playerRepository.findByName(name);
    }

    @Override
    public Player findByPlayerLastName(String lastname) throws Exception {
        return playerRepository.findByLastName(lastname);
    }

    @Override
    public void saveOrUpdatePlayer(Player player) throws Exception {
        playerRepository.save(player);
    }

    @Override
    public void deletePlayer(String id) throws Exception {
        if (id == null) {
            throw new Exception("user id is null");
        } else {
            playerRepository.deleteById(id);
        }
    }
}
