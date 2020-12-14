package com.genidev.stockmvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.genidev.stockmvc.dao.ICommandeClientDao;
import com.genidev.stockmvc.entities.CommandeClient;
import com.genidev.stockmvc.services.ICommandeClientService;

@Transactional
public class CommandeClientServiceImpl implements ICommandeClientService {

	private ICommandeClientDao dao;

	public void setDao(ICommandeClientDao dao) {
		this.dao = dao;
	}

	public CommandeClient save(CommandeClient entity) {
		return dao.save(entity);
	}

	public CommandeClient update(CommandeClient entity) {
		return dao.update(entity);
	}

	public List<CommandeClient> selectAll() {
		return dao.selectAll();
	}

	public List<CommandeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public CommandeClient getById(Long id) {
		return dao.getById(id);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public CommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public CommandeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
