package ciamb.demo.springmultipledbdemo.core.repository.primary;

import ciamb.demo.springmultipledbdemo.core.entity.primary.StudentPrimary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentPrimaryRepository extends JpaRepository<StudentPrimary, Integer> {
}
