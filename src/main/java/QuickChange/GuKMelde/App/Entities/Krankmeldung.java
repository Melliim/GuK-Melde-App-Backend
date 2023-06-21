package QuickChange.GuKMelde.App.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Krankmeldung {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee mitarbeiter;
    @ManyToOne
    @JoinColumn(name = "krankenkasse_id")
    private Krankenkasse krankenkasse;
    private Date startdatum;
    private Date enddatum;
    //true, if lohnfortzahlung wurde aktiviert
    private boolean lohnfortzahlung;
    //ture if personalabteilung hat bestätigt
    private boolean bestatigt;




    public boolean isBestatigt() {
        return bestatigt;
    }

    public void setBestatigt(boolean bestatigt) {
        this.bestatigt = bestatigt;
    }

    public Employee getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(Employee mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public Krankenkasse getKrankenkasse() {
        return krankenkasse;
    }

    public void setKrankenkasse(Krankenkasse krankenkasse) {
        this.krankenkasse = krankenkasse;
    }

    public void setStartdatum(Date startdatum) {
        this.startdatum = startdatum;
    }

    public void setEnddatum(Date enddatum) {
        this.enddatum = enddatum;
    }

    public void setLohnfortzahlung(boolean lohnfortzahlung) {
        this.lohnfortzahlung = lohnfortzahlung;
    }

    public Date getStartdatum() {
        return startdatum;
    }

    public Date getEnddatum() {
        return enddatum;
    }

    public boolean isLohnfortzahlung() {
        return lohnfortzahlung;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
