package pl.wsb.objectprogramming.java.tournaments.DTO;

import java.util.Date;

public class UpdateUserDTO {

    private String email;
    private Date dateOfBirth;
    private String password;

    public UpdateUserDTO(String email, Date dateOfBirth, String password) {
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
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
