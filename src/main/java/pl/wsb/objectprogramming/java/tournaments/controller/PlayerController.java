package pl.wsb.objectprogramming.java.tournaments.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wsb.objectprogramming.java.tournaments.model.Player;
import pl.wsb.objectprogramming.java.tournaments.service.PlayerService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping(value = "/")
    public List<Player> getAllPlayers() throws Exception {
        return playerService.findAllPlayers();
    }

    @GetMapping(value = "/byPlayerName/{playerName}")
    public Player getPlayerByUserName(@PathVariable("playerName") String playerName) throws Exception {
        return playerService.findByPlayerName(playerName);
    }

    @GetMapping(value = "/byPlayerLastName/{playerLastName}")
    public Player getPlayerByLastName(@PathVariable("playerLastName") String playerLastName) throws Exception {
        return playerService.findByPlayerLastName(playerLastName);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdatePlayer(@Valid @RequestBody Player player) throws Exception {
        playerService.saveOrUpdatePlayer(player);
        return new ResponseEntity<>("Player added Succesfully...", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deletePlayer(@PathVariable("id") String id) throws Exception {
        playerService.deletePlayer(id);
        return new ResponseEntity<>("Player deleted Succesfully...", HttpStatus.OK);
    }

}
