package pl.wsb.objectprogramming.java.tournaments.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Document(collection = "player")
public class Player {

    @Id
    private String id;
    @NotNull(message = "Nazwa nie moze byc pusta")
    @NotEmpty(message = "Nazwa nie moze byc pusta")
    private String name;
    private String lastName;
    private String createdBy;

    public Player() {
    }

    public Player(String name, String lastName, String createdBy) {
        this.name = name;
        this.lastName = lastName;
        this.createdBy = createdBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}

