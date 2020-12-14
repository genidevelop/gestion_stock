package com.genidev.stockmvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.genidev.stockmvc.dao.IVenteDao;
import com.genidev.stockmvc.entities.Vente;
import com.genidev.stockmvc.services.IVenteService;

@Transactional
public class VenteServiceImpl implements IVenteService {

	private IVenteDao dao;

	public void setDao(IVenteDao dao) {
		this.dao = dao;
	}

	public Vente save(Vente entity) {
		return dao.save(entity);
	}

	public Vente update(Vente entity) {
		return dao.update(entity);
	}

	public List<Vente> selectAll() {
		return dao.selectAll();
	}

	public List<Vente> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public Vente getById(Long id) {
		return dao.getById(id);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public Vente findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public Vente findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
