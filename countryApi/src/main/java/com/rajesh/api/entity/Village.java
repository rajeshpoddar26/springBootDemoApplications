package com.rajesh.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Village {

	@Id
	private String villageId;
	private String villageName;

	public String getVillageId() {
		return villageId;
	}

	public void setVillageId(String villageId) {
		this.villageId = villageId;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

}
