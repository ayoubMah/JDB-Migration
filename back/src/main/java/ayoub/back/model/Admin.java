package ayoub.back.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table( name = "admin",
        uniqueConstraints =  {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")

        })
public class Admin {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id ;

    @NotBlank
    @Size(max = 20)
    private String username ;

    @NotBlank
    @Size(max = 50)
    private String email ;

    @NotBlank
    @Size(max = 120)
    private String password ;

    public Admin(){

    }

    public Admin(String username, String email, String password){
        this.username = username ;
        this.email = email ;
        this.password = password ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
