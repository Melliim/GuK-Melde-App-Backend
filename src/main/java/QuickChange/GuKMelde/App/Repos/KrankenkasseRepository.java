package QuickChange.GuKMelde.App.Repos;

        import QuickChange.GuKMelde.App.Entities.Krankenkasse;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface KrankenkasseRepository extends CrudRepository<Krankenkasse, Long> {
}
