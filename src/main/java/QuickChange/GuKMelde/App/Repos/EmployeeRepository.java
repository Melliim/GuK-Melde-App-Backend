package QuickChange.GuKMelde.App.Repos;

import QuickChange.GuKMelde.App.Entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
