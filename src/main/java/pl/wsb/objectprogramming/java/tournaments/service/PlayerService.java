package pl.wsb.objectprogramming.java.tournaments.service;

import pl.wsb.objectprogramming.java.tournaments.model.Player;

import java.util.List;

public interface PlayerService {

    List<Player> findAllPlayers() throws Exception;

    Player findByPlayerName(String name) throws Exception;

    Player findByPlayerLastName(String lastname) throws Exception;

    void saveOrUpdatePlayer(Player player) throws Exception;

    void deletePlayer(String id) throws Exception;

}
