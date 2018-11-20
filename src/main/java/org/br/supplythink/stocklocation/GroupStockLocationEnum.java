package org.br.supplythink.stocklocation;

import org.br.supplythink.utils.EntityGroups;

public enum GroupStockLocationEnum {


	GRUPO_1(EntityGroups.GROUP_1),
	GRUPO_2(EntityGroups.GROUP_2),
	GRUPO_3(EntityGroups.GROUP_3),
	GRUPO_4(EntityGroups.GROUP_4),
	GRUPO_5(EntityGroups.GROUP_5),
	GRUPO_6(EntityGroups.GROUP_6),
	GRUPO_7(EntityGroups.GROUP_7),
	GRUPO_8(EntityGroups.GROUP_8),
	GRUPO_9(EntityGroups.GROUP_9),
	GRUPO_10(EntityGroups.GROUP_10),
	GRUPO_11(EntityGroups.GROUP_11),
	GRUPO_12(EntityGroups.GROUP_12);
	
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
