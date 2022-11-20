package com.problem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.problem.model.RelationShip;
@Repository
public interface RelationRepository extends JpaRepository<RelationShip, Long> {

}
