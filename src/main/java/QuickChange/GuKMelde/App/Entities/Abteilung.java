package QuickChange.GuKMelde.App.Entities;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Abteilung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Employee boss;
    @OneToOne
    private Employee stell_boss;
    private String bezeichnung;
    @OneToMany
    private List<Employee> employee;

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public Employee getStell_boss() {
        return stell_boss;
    }

    public void setStell_boss(Employee stell_boss) {
        this.stell_boss = stell_boss;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
