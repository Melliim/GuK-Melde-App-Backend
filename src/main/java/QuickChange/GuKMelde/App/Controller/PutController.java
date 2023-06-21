package QuickChange.GuKMelde.App.Controller;

import QuickChange.GuKMelde.App.Entities.Krankmeldung;
import QuickChange.GuKMelde.App.Service.PutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PutController {

    @Autowired
    PutService putService;



    @PutMapping("/krankmeldung")
    public Krankmeldung updateKrankmeldung(@RequestBody Krankmeldung krankmeldung){
        return putService.updateKrankmeldung(krankmeldung);
    }
}
