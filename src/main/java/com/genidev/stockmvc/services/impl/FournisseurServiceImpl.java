package com.genidev.stockmvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.genidev.stockmvc.dao.IFournisseurDao;
import com.genidev.stockmvc.entities.Fournisseur;
import com.genidev.stockmvc.services.IFournisseurService;

@Transactional
public class FournisseurServiceImpl implements IFournisseurService {

	private IFournisseurDao dao;

	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}

	public Fournisseur save(Fournisseur entity) {
		return dao.save(entity);
	}

	public Fournisseur update(Fournisseur entity) {
		return dao.update(entity);
	}

	public List<Fournisseur> selectAll() {
		return dao.selectAll();
	}

	public List<Fournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public Fournisseur getById(Long id) {
		return dao.getById(id);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public Fournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public Fournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
