package com.problem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.problem.model.Category;
import com.problem.model.RelationShip;

@Service
public interface RelationShipService {

    public RelationShip saveRelationShip(RelationShip relationShip);
	
	public RelationShip updateCategory(RelationShip relationShip);
	
	public RelationShip deleteCategory(RelationShip relationShip);
	
	public List<RelationShip> getAllRelationShip();
}
