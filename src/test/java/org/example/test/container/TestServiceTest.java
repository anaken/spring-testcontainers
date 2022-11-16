package org.example.test.container;

import org.example.test.container.entity.ParameterEntity;
import org.example.test.container.repo.ParameterRepo;
import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Sql(scripts = "/dictionaryData.sql")
public class TestServiceTest {

    @ClassRule
    private TestMSSQLServerContainer container = TestMSSQLServerContainer.getInstance();

    @Autowired
    TestService testService;

    @Autowired
    ParameterRepo parameterRepo;

    @Transactional
    @Test
    public void testSome() {
        List rows = testService.getRows();
        for (Object row : rows) {
            System.out.println(row);
        }
        assertEquals(2, rows.size());

        ParameterEntity call_1_rkk2 = parameterRepo.getReferenceById("CALL_1_RKK2");
        assertEquals("Fact_Salary_Cnt", call_1_rkk2.getParameterName());
    }
}