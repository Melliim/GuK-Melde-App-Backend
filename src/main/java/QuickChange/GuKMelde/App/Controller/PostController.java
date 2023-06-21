package QuickChange.GuKMelde.App.Controller;

import QuickChange.GuKMelde.App.Entities.Abteilung;
import QuickChange.GuKMelde.App.Entities.Employee;
import QuickChange.GuKMelde.App.Entities.Krankenkasse;
import QuickChange.GuKMelde.App.Entities.Krankmeldung;
import QuickChange.GuKMelde.App.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/krankmeldung")
    public Krankmeldung createKrankmeldung(@RequestBody Krankmeldung krankmeldung) {
        return postService.saveKrankmeldung(krankmeldung);
    }

    @PostMapping("/krankenkasse")
    public Krankenkasse createKrankekasse(@RequestBody Krankenkasse krankenkasse) {
        return postService.saveKrankenkasse(krankenkasse);
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return postService.saveEmployee(employee);
    }

    @PostMapping("/abteilung")
    public Abteilung createAbteilung(@RequestBody Abteilung abteilung) {
        return postService.saveAbteilung(abteilung);
    }


}
