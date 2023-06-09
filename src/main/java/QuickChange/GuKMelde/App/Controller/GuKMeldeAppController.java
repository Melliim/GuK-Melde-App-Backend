package QuickChange.GuKMelde.App.Controller;

import QuickChange.GuKMelde.App.Entities.Krankmeldung;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuKMeldeAppController {

    @GetMapping(path = "/krankmeldung/{id}")
    public Krankmeldung getKrankmeldungById(@PathVariable Long id) {

        return null;
    }
}
