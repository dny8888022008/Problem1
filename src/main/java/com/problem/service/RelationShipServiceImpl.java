package com.problem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.problem.model.RelationShip;
import com.problem.repository.RelationRepository;

public class RelationShipServiceImpl implements RelationShipService {

	private RelationRepository relationRepository;

	public RelationShip saveRelationShip(RelationShip relationShip) {
		return relationRepository.save(relationShip);
	}



	public List<RelationShip> getAllRelationShip() {
		return relationRepository.findAll();
	}

	@Override
	public RelationShip updateCategory(RelationShip relationShip) {
	return relationRepository.save(relationShip);
	}

	@Override
	public RelationShip deleteCategory(RelationShip relationShip) {
		relationRepository.delete(relationShip);
		return relationShip;
	}

}
