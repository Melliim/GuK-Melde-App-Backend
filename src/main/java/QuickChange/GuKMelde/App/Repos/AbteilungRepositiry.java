package QuickChange.GuKMelde.App.Repos;

import QuickChange.GuKMelde.App.Entities.Abteilung;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbteilungRepositiry extends CrudRepository<Abteilung, Long> {
}
