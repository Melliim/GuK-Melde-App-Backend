package QuickChange.GuKMelde.App.Controller;

import QuickChange.GuKMelde.App.Entities.Abteilung;
import QuickChange.GuKMelde.App.Entities.Employee;
import QuickChange.GuKMelde.App.Entities.Krankenkasse;
import QuickChange.GuKMelde.App.Entities.Krankmeldung;
import QuickChange.GuKMelde.App.Service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuKMeldeAppController {

    @Autowired
    ServiceClass service;

    @GetMapping("/abteilungen")
    public List<Abteilung> getAbteilungen(){
        return service.getAbteilungen();
    }

    @GetMapping(path = "/abteilung/{id}")
    public Abteilung getAbteilungById(@PathVariable Long id) {
        return service.getAbteilungById(id);
    }

    @GetMapping(path = "/krankmeldungen")
    public List<Krankmeldung> getKrankmeldungen(){
        return service.getKrankmeldungen();
    }

    @GetMapping(path = "/krankmeldung/{id}")
    public Krankmeldung getKrankmeldungById(@PathVariable Long id) {
        return service.getKrankmeldungById(id);
    }

    @GetMapping(path = "/mitarbeiter")
    public List<Employee> getEmployee(){
        return service.getEmployee();
    }

    @GetMapping(path = "/mitarbeiter/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @GetMapping(path = "/krankenkassen")
    public List<Krankenkasse> getKrankenkassen(){
        return service.getKrankenkassen();
    }

    @GetMapping(path = "/krankenkasse/{id}")
    public Krankenkasse getKrankenkasseById(@PathVariable Long id) {
        return service.getKrankenkasseById(id);
    }



}
