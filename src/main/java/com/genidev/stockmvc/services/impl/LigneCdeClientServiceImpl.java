package com.genidev.stockmvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.genidev.stockmvc.dao.ILigneCdeClientDao;
import com.genidev.stockmvc.entities.LigneCdeClient;
import com.genidev.stockmvc.services.ILigneCdeClientService;

@Transactional
public class LigneCdeClientServiceImpl implements ILigneCdeClientService {

	private ILigneCdeClientDao dao;

	public void setDao(ILigneCdeClientDao dao) {
		this.dao = dao;
	}

	public LigneCdeClient save(LigneCdeClient entity) {
		return dao.save(entity);
	}

	public LigneCdeClient update(LigneCdeClient entity) {
		return dao.update(entity);
	}

	public List<LigneCdeClient> selectAll() {
		return dao.selectAll();
	}

	public List<LigneCdeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public LigneCdeClient getById(Long id) {
		return dao.getById(id);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public LigneCdeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public LigneCdeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
