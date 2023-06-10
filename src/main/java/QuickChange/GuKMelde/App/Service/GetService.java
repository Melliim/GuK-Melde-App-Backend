package QuickChange.GuKMelde.App.Service;

import QuickChange.GuKMelde.App.Entities.Abteilung;
import QuickChange.GuKMelde.App.Entities.Employee;
import QuickChange.GuKMelde.App.Entities.Krankenkasse;
import QuickChange.GuKMelde.App.Entities.Krankmeldung;
import QuickChange.GuKMelde.App.Repos.AbteilungRepositiry;
import QuickChange.GuKMelde.App.Repos.EmployeeRepository;
import QuickChange.GuKMelde.App.Repos.KrankenkasseRepository;
import QuickChange.GuKMelde.App.Repos.KrankmeldungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetService {

    @Autowired
    AbteilungRepositiry abteilungRepositiry;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    KrankenkasseRepository krankenkasseRepository;
    @Autowired
    KrankmeldungRepository krankmeldungRepository;

    //getByIdMethods below

    public Abteilung getAbteilungById(Long id) {
        return abteilungRepositiry.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Krankmeldung getKrankmeldungById(Long id) {
        return krankmeldungRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Krankenkasse getKrankenkasseById(Long id) {
        return krankenkasseRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

//    getAllMethods below

    public List<Krankmeldung> getKrankmeldungen(){
        Iterable<Krankmeldung> iterator = krankmeldungRepository.findAll();
        List<Krankmeldung> things = new ArrayList<>();
        for (Krankmeldung thing : iterator)  things.add(thing);

        return things;
    }

    public List<Abteilung> getAbteilungen() {
        Iterable<Abteilung> iterator = abteilungRepositiry.findAll();
        List<Abteilung> things = new ArrayList<>();
        for (Abteilung thing : iterator)  things.add(thing);

        return things;
    }


    public List<Employee> getEmployee() {
        Iterable<Employee> iterator = employeeRepository.findAll();
        List<Employee> things = new ArrayList<>();
        for (Employee thing : iterator)  things.add(thing);

        return things;
    }

    public List<Krankenkasse> getKrankenkassen() {
        Iterable<Krankenkasse> iterator = krankenkasseRepository.findAll();
        List<Krankenkasse> things = new ArrayList<>();
        for (Krankenkasse thing : iterator)  things.add(thing);

        return things;
    }
}
