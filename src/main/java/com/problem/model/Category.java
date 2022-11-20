package com.problem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String Name;
	

	public Category() {
		
	}

	public Category(Long id, String name) {
		super();
		Id = id;
		Name = name;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Category [Id=" + Id + ", Name=" + Name + "]";
	}

	
}
