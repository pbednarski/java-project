package pl.wsb.objectprogramming.java.tournaments.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collation = "user")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String dateOfBirth;
    private String password;
    private Integer access;

}
