package com.problem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.problem.model.Category;
import com.problem.repository.CategoryRepository;

@Service
public interface CategoryService {

	public Category saveCategory(Category category);
	
	public Category updateCategory(Category category);
	
	public Category deleteCategory(Category category);
	
	public Category getByIdCategory(Long categoryId);
	
	public List<Category> getAllCategory();
	
}
