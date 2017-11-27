package nc.flycamel.mytest.domain.repository;

import nc.flycamel.mytest.domain.model.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestTableRepository extends JpaRepository<TestTable, Long> {
}
