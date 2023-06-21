package QuickChange.GuKMelde.App.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @OneToMany
    private List<Krankmeldung> krankmeldungList;
    private String email;
    @ManyToOne
    private Abteilung abteilung;
    private String nachname;
    private boolean sexIsFemale;

    public Employee(){
    }

    public List<Krankmeldung> getKrankmeldungList() {
        return krankmeldungList;
    }

    public void setKrankmeldungList(List<Krankmeldung> krankmeldungList) {
        this.krankmeldungList = krankmeldungList;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public boolean isSexIsFemale() {
        return sexIsFemale;
    }

    public void setSexIsFemale(boolean sexIsFemale) {
        this.sexIsFemale = sexIsFemale;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Abteilung getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(Abteilung abteilung) {
        this.abteilung = abteilung;
    }
}
