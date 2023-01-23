package ciamb.demo.springmultipledbdemo.core.repository.second;

import ciamb.demo.springmultipledbdemo.core.entity.second.StudentSecond;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentSecondRepository extends JpaRepository<StudentSecond, Integer> {
}
