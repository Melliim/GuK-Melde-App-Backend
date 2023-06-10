package QuickChange.GuKMelde.App.Controller;

import QuickChange.GuKMelde.App.Entities.Abteilung;
import QuickChange.GuKMelde.App.Entities.Employee;
import QuickChange.GuKMelde.App.Entities.Krankenkasse;
import QuickChange.GuKMelde.App.Entities.Krankmeldung;
import QuickChange.GuKMelde.App.Service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetController {

    @Autowired
    GetService getService;

    @GetMapping("/abteilungen")
    public List<Abteilung> getAbteilungen(){
        return getService.getAbteilungen();
    }

    @GetMapping(path = "/abteilung/{id}")
    public Abteilung getAbteilungById(@PathVariable Long id) {
        return getService.getAbteilungById(id);
    }

    @GetMapping(path = "/krankmeldungen")
    public List<Krankmeldung> getKrankmeldungen(){
        return getService.getKrankmeldungen();
    }

    @GetMapping(path = "/krankmeldung/{id}")
    public Krankmeldung getKrankmeldungById(@PathVariable Long id) {
        return getService.getKrankmeldungById(id);
    }

    @GetMapping(path = "/mitarbeiter")
    public List<Employee> getEmployee(){
        return getService.getEmployee();
    }

    @GetMapping(path = "/mitarbeiter/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return getService.getEmployeeById(id);
    }

    @GetMapping(path = "/krankenkassen")
    public List<Krankenkasse> getKrankenkassen(){
        return getService.getKrankenkassen();
    }

    @GetMapping(path = "/krankenkasse/{id}")
    public Krankenkasse getKrankenkasseById(@PathVariable Long id) {
        return getService.getKrankenkasseById(id);
    }





}
