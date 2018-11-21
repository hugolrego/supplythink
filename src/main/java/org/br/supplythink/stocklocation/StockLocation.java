package org.br.supplythink.stocklocation;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.br.supplythink.model.BaseEntity;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "stock_location")
public class StockLocation extends BaseEntity{

		@NotEmpty
	    @Column(name = "description")
	    private String description;

		@ManyToMany
		@JoinTable(name ="stock_location_groups", 
		           joinColumns=@JoinColumn(name = "id_stock_location"), 
		           inverseJoinColumns=@JoinColumn(name = "id_type") )
	    private List<StockLocationType> stockLocationGroups;
		
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<StockLocationType> getStockLocationGroups() {
			return stockLocationGroups;
		}

		public void setStockLocationGroups(List<StockLocationType> stockLocationGroups) {
			this.stockLocationGroups = stockLocationGroups;
		}	
	 
	 
	 
		

}
