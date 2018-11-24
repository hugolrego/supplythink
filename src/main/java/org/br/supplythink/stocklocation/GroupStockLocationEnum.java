package org.br.supplythink.stocklocation;

import org.br.supplythink.utils.EntityGroups;

public enum GroupStockLocationEnum {


	GRUPO_1(EntityGroups.GROUP_1),
	GRUPO_2(EntityGroups.GROUP_2),
	GRUPO_3(EntityGroups.GROUP_3);
	
	private int group;
	
	
	GroupStockLocationEnum(int type){
		this.group = type;
	}


	public int getGroup() {
		return group;
	}


	public void setGroup(int group) {
		this.group = group;
	}
	
	

}
