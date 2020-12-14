package com.genidev.stockmvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.genidev.stockmvc.dao.IClientDao;
import com.genidev.stockmvc.entities.Client;
import com.genidev.stockmvc.services.IClientService;

@Transactional
public class ClientServiceImpl implements IClientService {

	private IClientDao dao;

	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	public Client save(Client entity) {
		return dao.save(entity);
	}

	public Client update(Client entity) {
		return dao.update(entity);
	}

	public List<Client> selectAll() {
		return dao.selectAll();
	}

	public List<Client> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public Client getById(Long id) {
		return dao.getById(id);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public Client findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public Client findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
