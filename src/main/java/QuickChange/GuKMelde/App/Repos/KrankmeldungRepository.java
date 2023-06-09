package QuickChange.GuKMelde.App.Repos;

import QuickChange.GuKMelde.App.Entities.Krankmeldung;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KrankmeldungRepository extends CrudRepository<Krankmeldung, Long> {
}
