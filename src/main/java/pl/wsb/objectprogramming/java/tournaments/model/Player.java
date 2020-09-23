package pl.wsb.objectprogramming.java.tournaments.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "players")
public class Player {

    @Id
    private String Id;
    private String Name;
    private String LastName;
    private String CreatedBy;

}

