package ge.ibsu.demo.repository;

import ge.ibsu.demo.entities.Departament;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Departament, Long> {
}
