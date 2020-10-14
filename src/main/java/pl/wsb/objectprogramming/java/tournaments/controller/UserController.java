package pl.wsb.objectprogramming.java.tournaments.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wsb.objectprogramming.java.tournaments.dto.CreateUserDTO;
import pl.wsb.objectprogramming.java.tournaments.exceptions.UserAlreadyExistException;
import pl.wsb.objectprogramming.java.tournaments.exceptions.UserNotFoundException;
import pl.wsb.objectprogramming.java.tournaments.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<?>> getAllUsers() {
        try {
            return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.OK);
        } catch (UserNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/users/{name}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> getUsersByName(@PathVariable(value = "name") String userName) {
        try {
            return new ResponseEntity<>(userService.getUserByName(userName), HttpStatus.OK);
        } catch (UserNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/users")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createUser(@RequestBody CreateUserDTO createUserDTO) {
        try {
            return new ResponseEntity<>(userService.addUser(createUserDTO), HttpStatus.CREATED);
        } catch (UserAlreadyExistException | UserNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }

    }

    @DeleteMapping(value = "/users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteUsersById(@PathVariable(value = "id") UUID userId) {
        try {
            return new ResponseEntity<>(userService.deleteUser(userId), HttpStatus.OK);
        } catch (UserNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}
