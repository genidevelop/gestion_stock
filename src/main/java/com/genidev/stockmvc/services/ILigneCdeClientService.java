package com.genidev.stockmvc.services;

import java.util.List;

import com.genidev.stockmvc.entities.LigneCdeClient;

public interface ILigneCdeClientService {
	public LigneCdeClient save(LigneCdeClient entity);

	public LigneCdeClient update(LigneCdeClient entity);

	public List<LigneCdeClient> selectAll();

	public List<LigneCdeClient> selectAll(String sortField, String sort);

	public LigneCdeClient getById(Long id);

	public void remove(Long id);

	public LigneCdeClient findOne(String paramName, Object paramValue);

	public LigneCdeClient findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);
}
