package pl.wsb.objectprogramming.java.tournaments.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wsb.objectprogramming.java.tournaments.model.User;
import pl.wsb.objectprogramming.java.tournaments.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping(value = "/byUserName/{userName}")
    public User getUserByUserName(@PathVariable("userName") String userName){
        return userService.findByUserName(userName);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateUser(@RequestBody User user){
        userService.saveOrUpdateUser(user);
        return new ResponseEntity("User added Succesfully...", HttpStatus.OK);
    }

}
