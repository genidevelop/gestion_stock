package com.genidev.stockmvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.genidev.stockmvc.dao.ILigneVenteDao;
import com.genidev.stockmvc.entities.LigneVente;
import com.genidev.stockmvc.services.ILigneVenteService;

@Transactional
public class LigneVenteServiceImpl implements ILigneVenteService {

	private ILigneVenteDao dao;

	public void setDao(ILigneVenteDao dao) {
		this.dao = dao;
	}

	public LigneVente save(LigneVente entity) {
		return dao.save(entity);
	}

	public LigneVente update(LigneVente entity) {
		return dao.update(entity);
	}

	public List<LigneVente> selectAll() {
		return dao.selectAll();
	}

	public List<LigneVente> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public LigneVente getById(Long id) {
		return dao.getById(id);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public LigneVente findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public LigneVente findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
