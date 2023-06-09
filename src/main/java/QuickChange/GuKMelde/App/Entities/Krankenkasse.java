package QuickChange.GuKMelde.App.Entities;

import jakarta.persistence.*;

@Entity
public class Krankenkasse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "krankenkasse_id")
    private Long id;
    private String name;
    private String email;
    private String telephone;
    private String ansprechpartner;


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAnsprechpartner(String ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAnsprechpartner() {
        return ansprechpartner;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
