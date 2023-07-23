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
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class PostService {

    @Autowired
    AbteilungRepositiry abteilungRepositiry;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    KrankenkasseRepository krankenkasseRepository;
    @Autowired
    KrankmeldungRepository krankmeldungRepository;

    public Krankmeldung saveKrankmeldung(Krankmeldung krankmeldung) {
        System.out.println(krankmeldung.getImage());
        return krankmeldungRepository.save(krankmeldung);
    }

    public Krankenkasse saveKrankenkasse(Krankenkasse krankenkasse) {
        return krankenkasseRepository.save(krankenkasse);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Abteilung saveAbteilung(Abteilung abteilung) {
        return abteilungRepositiry.save(abteilung);
    }
}
