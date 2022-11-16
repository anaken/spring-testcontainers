package org.example.test.container;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@RequiredArgsConstructor
@Component
public class TestService {
    private final EntityManager entityManager;

    public List getRows() {
        Query query = entityManager.createNativeQuery("SELECT * FROM RTDM_DICT.DICT_RTDM_PARAMETERS");
        return query.getResultList();
    }
}
