package org.br.supplythink.stocklocation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.br.supplythink.model.BaseEntity;
import org.br.supplythink.model.NamedEntity;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "stock_location_type")
public class StockLocationType  extends BaseEntity{
	

	@ManyToMany(mappedBy = "stockLocationGroups")
    private List<StockLocation> stockLocation = new ArrayList<StockLocation>();

	@NotEmpty
    @Column(name = "description")
    private String description;

	public List<StockLocation> getStockLocation() {
		return stockLocation;
	}

	public void setStockLocation(List<StockLocation> stockLocation) {
		this.stockLocation = stockLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}
