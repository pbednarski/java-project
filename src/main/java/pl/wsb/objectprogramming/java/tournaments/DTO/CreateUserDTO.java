package pl.wsb.objectprogramming.java.tournaments.DTO;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.UUID;

public class CreateUserDTO {

    private String name;
    private String email;
    private Date dateOfBirth;
    private String password;

    public CreateUserDTO() {
    }

    public CreateUserDTO(String name, String email, Date dateOfBirth, String password) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
