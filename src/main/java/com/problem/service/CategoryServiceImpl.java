package com.problem.service;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import com.problem.model.Category;
import com.problem.repository.CategoryRepository;

public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category updateCategory(Category category) {
		Category category2 = categoryRepository.findById(category.getId()).get();
		if (category2 != null) {
			return categoryRepository.save(category);
		} else {
			throw new ObjectNotFoundException("category not found in database", null);
		}

	}

	public Category deleteCategory(Category category) {
		Category category2 = categoryRepository.findById(category.getId()).get();
		if (category2 != null) {
			categoryRepository.delete(category2);
			return category;
		} else {
			throw new ObjectNotFoundException("category not found in database", null);
		}
	}

	@Override
	public Category getByIdCategory(Long categoryId) {
		return categoryRepository.findById(categoryId).get();
	}

	@Override
	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

}
