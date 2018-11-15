package org.br.supplythink.stocklocation;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.br.supplythink.model.BaseEntity;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "stock_location")
public class StockLocation extends BaseEntity{
	
	 @NotEmpty
	    @Column(name = "description")
	    private String description;	
	 
	 
	    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "stock_location")
	    //private Set<StockLocationGroups> stockLocationGroups;
	 

}
