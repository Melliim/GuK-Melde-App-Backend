package QuickChange.GuKMelde.App.Service;

import QuickChange.GuKMelde.App.Entities.Krankmeldung;
import QuickChange.GuKMelde.App.Repos.KrankmeldungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PutService {


    @Autowired
    KrankmeldungRepository krankmeldungRepository;


    public Krankmeldung updateKrankmeldung(Krankmeldung krankmeldung) {

    Optional<Krankmeldung> existing = krankmeldungRepository.findById(krankmeldung.getId());
    Krankmeldung  krankmeldung1 = existing.get();

    krankmeldung1.setBestatigt(krankmeldung.isBestatigt());
    krankmeldung1.setKrankenkasse(krankmeldung.getKrankenkasse());
    krankmeldung1.setLohnfortzahlung(krankmeldung.isLohnfortzahlung());
    krankmeldung1.setStartdatum(krankmeldung.getStartdatum());
    krankmeldung1.setEnddatum(krankmeldung.getEnddatum());
    krankmeldung1.setMitarbeiter(krankmeldung.getMitarbeiter());

    return krankmeldungRepository.save(krankmeldung1);


    }

    public void deleteKrankmeldung(Long id){
        krankmeldungRepository.deleteById(id);
    }
}
