package com.problem.model;

import javax.persistence.Entity;

@Entity
public class RelationShip {

	private long category1;
	private long category2;
	private String relationShipName;

	public RelationShip() {
		super();
	}

	public RelationShip(long category1, long category2, String relationShipName) {
		super();
		this.category1 = category1;
		this.category2 = category2;
		this.relationShipName = relationShipName;
	}

	public long getCategory1() {
		return category1;
	}

	public void setCategory1(long category1) {
		this.category1 = category1;
	}

	public long getCategory2() {
		return category2;
	}

	public void setCategory2(long category2) {
		this.category2 = category2;
	}

	public String getRelationShipName() {
		return relationShipName;
	}

	public void setRelationShipName(String relationShipName) {
		this.relationShipName = relationShipName;
	}

	@Override
	public String toString() {
		return "RelationShip [category1=" + category1 + ", category2=" + category2 + ", relationShipName="
				+ relationShipName + "]";
	}

}
