package nc.flycamel.mytest.api;

import nc.flycamel.mytest.domain.TestTableDomainService;
import nc.flycamel.mytest.domain.model.TestTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TestController {

    private TestTableDomainService testTableDomainService;

    @Resource
    public void setTestTableDomainService(TestTableDomainService testTableDomainService) {
        this.testTableDomainService = testTableDomainService;
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "hi~";
    }

    @RequestMapping("/testTableList")
    @ResponseBody
    List<String> getTestTableList() {
        List<TestTable> testTables = testTableDomainService.getAllData();

        return testTables.stream().map(Object::toString).collect(Collectors.toList());
    }
}
