package org.example.test.container.repo;

import org.example.test.container.entity.ParameterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterRepo extends JpaRepository<ParameterEntity, String> {
}
