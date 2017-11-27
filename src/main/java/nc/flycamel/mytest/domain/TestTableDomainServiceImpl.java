package nc.flycamel.mytest.domain;

import nc.flycamel.mytest.domain.model.TestTable;
import nc.flycamel.mytest.domain.repository.TestTableRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestTableDomainServiceImpl implements TestTableDomainService {
    private TestTableRepository testTableRepository;

    @Resource
    public void setTestTableRepository(TestTableRepository testTableRepository) {
        this.testTableRepository = testTableRepository;
    }

    @Override
    public List<TestTable> getAllData() {
        return testTableRepository.findAll();
    }
}
