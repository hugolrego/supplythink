package org.br.supplythink.stocklocation;

import java.util.Collection;

import org.br.supplythink.owner.Owner;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface StockLocationRepository extends Repository<StockLocation, Integer> {

	    @Transactional(readOnly = true)
	    Collection<StockLocation> findAll() throws DataAccessException;


	    /**
	     * Retrieve an {@link Owner} from the data store by id.
	     * @param id the id to search for
	     * @return the {@link Owner} if found
	     */
	    //@Query("SELECT owner FROM Owner owner left join fetch owner.pets WHERE owner.id =:id")
	    @Transactional(readOnly = true)
	    StockLocation findById(@Param("id") Integer id);
	    
	    
	    /**
	     * Save an {@link Owner} to the data store, either inserting or updating it.
	     * @param owner the {@link Owner} to save
	     */
	    void save(StockLocation stockLocation);
	    
	    void delete(@Param("id") Integer id);	    
}
