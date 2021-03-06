package org.br.supplythink.vet;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface VetRepository extends Repository<Vet, Integer> {

    @Transactional(readOnly = true)
    Collection<Vet> findAll() throws DataAccessException;


}
