package pl.wsb.objectprogramming.java.tournaments.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wsb.objectprogramming.java.tournaments.DTO.CreateUserDTO;
import pl.wsb.objectprogramming.java.tournaments.model.User;
import pl.wsb.objectprogramming.java.tournaments.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping(value = "/user/{_id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<User> getUserById(@PathVariable(value = "_id") UUID _id) {
        return new ResponseEntity<>(userService.getUserById(_id), HttpStatus.OK);
    }

    @PostMapping(value = "/user")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> createUser(@RequestBody CreateUserDTO createUserDTO) {
        return new ResponseEntity<>(userService.addUser(createUserDTO), HttpStatus.CREATED);
    }

}
