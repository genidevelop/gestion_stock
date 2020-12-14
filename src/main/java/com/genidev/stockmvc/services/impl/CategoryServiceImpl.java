package com.genidev.stockmvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.genidev.stockmvc.dao.ICategoryDao;
import com.genidev.stockmvc.entities.Category;
import com.genidev.stockmvc.services.ICategoryService;

@Transactional
public class CategoryServiceImpl implements ICategoryService {

	private ICategoryDao dao;

	public void setDao(ICategoryDao dao) {
		this.dao = dao;
	}

	public Category save(Category entity) {
		return dao.save(entity);
	}

	public Category update(Category entity) {
		return dao.update(entity);
	}

	public List<Category> selectAll() {
		return dao.selectAll();
	}

	public List<Category> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public Category getById(Long id) {
		return dao.getById(id);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public Category findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public Category findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
