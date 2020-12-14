package com.genidev.stockmvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.genidev.stockmvc.dao.ILigneCdeFournisseurDao;
import com.genidev.stockmvc.entities.LigneCdeFournisseur;
import com.genidev.stockmvc.services.ILigneCdeFournisseurService;

@Transactional
public class LigneCdeFournisseurServiceImpl implements ILigneCdeFournisseurService {

	private ILigneCdeFournisseurDao dao;

	public void setDao(ILigneCdeFournisseurDao dao) {
		this.dao = dao;
	}

	public LigneCdeFournisseur save(LigneCdeFournisseur entity) {
		return dao.save(entity);
	}

	public LigneCdeFournisseur update(LigneCdeFournisseur entity) {
		return dao.update(entity);
	}

	public List<LigneCdeFournisseur> selectAll() {
		return dao.selectAll();
	}

	public List<LigneCdeFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public LigneCdeFournisseur getById(Long id) {
		return dao.getById(id);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public LigneCdeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public LigneCdeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
