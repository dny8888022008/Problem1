package com.problem.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.problem.model.RelationShip;
import com.problem.service.RelationShipService;

@RestController
@RequestMapping("/relation")
public class RelationController {

	@Autowired
	private RelationShipService relationShipService;
	
	@PostMapping("/save")
	private ResponseEntity<RelationShip> saveRelationShip(@RequestBody RelationShip relationShip){
		return new ResponseEntity<RelationShip>(relationShipService.saveRelationShip(relationShip), HttpStatus.OK);
	}
	
	@PostMapping("/update")
	private ResponseEntity<RelationShip> updateRelatiponShip(@RequestBody RelationShip relationShip){
		return new ResponseEntity<RelationShip>(relationShipService.updateCategory(relationShip), HttpStatus.OK);
	}
	
	@PostMapping("/delete")
	private ResponseEntity<RelationShip> deleteRelationShip(@RequestBody RelationShip relationShip){
		return new ResponseEntity<RelationShip>(relationShipService.deleteCategory(relationShip), HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	private ResponseEntity<List<RelationShip>> getAllRealationShip() {
   		return new ResponseEntity<List<RelationShip>>(relationShipService.getAllRelationShip(), HttpStatus.OK);
	}
	
}
