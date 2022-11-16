package org.example.test.container;

import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
//@ContextConfiguration(initializers = {TestServiceTest.Initializer.class})
@Sql(scripts = "/dictionaryData.sql")
public class TestServiceTest {

//    static class Initializer
//            implements ApplicationContextInitializer<ConfigurableApplicationContext> {
//        public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
//            TestMSSQLServerContainer container = TestMSSQLServerContainer.getInstance();
//            TestPropertyValues.of(
//                    "spring.datasource.url=" + container.getJdbcUrl(),
//                    "spring.datasource.name=" + container.getUsername(),
//                    "spring.datasource.password=" + container.getPassword()
//            ).applyTo(configurableApplicationContext.getEnvironment());
//        }
//    }

    @ClassRule
    private TestMSSQLServerContainer container = TestMSSQLServerContainer.getInstance();

    @Autowired
    TestService testService;

    //@Transactional
    @Test
    public void testSome() {
        List rows = testService.getRows();
        for (Object row : rows) {
            System.out.println(row);
        }
        assertEquals(4, rows.size());
    }
}