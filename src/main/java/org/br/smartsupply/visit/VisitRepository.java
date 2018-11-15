package org.br.smartsupply.visit;

import java.util.List;

import org.br.smartsupply.model.BaseEntity;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

public interface VisitRepository extends Repository<Visit, Integer> {

    void save(Visit visit) throws DataAccessException;

    List<Visit> findByPetId(Integer petId);

}
