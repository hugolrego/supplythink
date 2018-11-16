package org.br.supplythink.stocklocation;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StockLocationRepository extends CrudRepository<StockLocation, Integer> {


	    Collection<StockLocation> findAll() throws DataAccessException;


	    //@Query("SELECT owner FROM Owner owner left join fetch owner.pets WHERE owner.id =:id")
	    StockLocation findById(@Param("id") Integer id);
	    
	    
}
