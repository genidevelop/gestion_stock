package com.genidev.stockmvc.services;

import java.util.List;

import com.genidev.stockmvc.entities.LigneCdeFournisseur;

public interface ILigneCdeFournisseurService {
	public LigneCdeFournisseur save(LigneCdeFournisseur entity);

	public LigneCdeFournisseur update(LigneCdeFournisseur entity);

	public List<LigneCdeFournisseur> selectAll();

	public List<LigneCdeFournisseur> selectAll(String sortField, String sort);

	public LigneCdeFournisseur getById(Long id);

	public void remove(Long id);

	public LigneCdeFournisseur findOne(String paramName, Object paramValue);

	public LigneCdeFournisseur findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);
}
