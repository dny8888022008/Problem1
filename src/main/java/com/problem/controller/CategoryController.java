package com.problem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.problem.model.Category;
import com.problem.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping("/add")
	private ResponseEntity<Category> saveCategory(@RequestBody Category category) {
		return new ResponseEntity<Category>(categoryService.saveCategory(category), HttpStatus.OK);
	}

	@PutMapping("/update")
	private ResponseEntity<Category> updateCategory(@RequestBody Category category) {
		return new ResponseEntity<Category>(categoryService.updateCategory(category), HttpStatus.OK);
	}
	
	@PostMapping("delete")
	private ResponseEntity<Category> deleteCategory(@RequestBody Category category){
		return new ResponseEntity<Category>(categoryService.deleteCategory(category),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	private ResponseEntity<Category> getByIdcategory(@PathVariable(name = "id") Long id){
		return new ResponseEntity<Category>(categoryService.getByIdCategory(id),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getAll")
	private ResponseEntity<List<Category>> getAllCategory(){
		return new ResponseEntity<List<Category>>(categoryService.getAllCategory(), HttpStatus.OK);
	}
	

}
