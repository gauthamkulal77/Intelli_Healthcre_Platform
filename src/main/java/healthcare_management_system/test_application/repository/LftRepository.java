package healthcare_management_system.test_application.repository;

import healthcare_management_system.test_application.model.CoagulationProfileTest;
import healthcare_management_system.test_application.model.LiverFunctionTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LftRepository extends JpaRepository<LiverFunctionTest,Integer> {
    List<LiverFunctionTest> findByStatus(String status);
}
