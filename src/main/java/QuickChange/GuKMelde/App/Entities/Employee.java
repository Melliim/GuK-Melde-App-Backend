package QuickChange.GuKMelde.App.Entities;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vorgesetzer_id")
    private Employee vorgesetzer;
    @ManyToOne
    @JoinColumn(name = "sellvertreter_id")
    private Employee stellvertreter_vorgesetzer;
    private String username;
    private String password;
    private String email;
    @ManyToOne
    @JoinColumn(name = "abteilung_id")
    private Abteilung abteilung;

    public Employee(){
    }

    public Employee getVorgesetzer() {
        return vorgesetzer;
    }

    public void setVorgesetzer(Employee vorgesetzer) {
        this.vorgesetzer = vorgesetzer;
    }

    public Employee getStellvertreter_vorgesetzer() {
        return stellvertreter_vorgesetzer;
    }

    public void setStellvertreter_vorgesetzer(Employee stellvertreter_vorgesetzer) {
        this.stellvertreter_vorgesetzer = stellvertreter_vorgesetzer;
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
