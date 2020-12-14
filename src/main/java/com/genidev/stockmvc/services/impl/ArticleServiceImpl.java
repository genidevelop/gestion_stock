package com.genidev.stockmvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.genidev.stockmvc.dao.IArticleDao;
import com.genidev.stockmvc.entities.Article;
import com.genidev.stockmvc.services.IArticleService;

@Transactional
public class ArticleServiceImpl implements IArticleService {

	private IArticleDao dao;

	public void setDao(IArticleDao dao) {
		this.dao = dao;
	}

	public Article save(Article entity) {
		return dao.save(entity);
	}

	public Article update(Article entity) {
		return dao.update(entity);
	}

	public List<Article> selectAll() {
		return dao.selectAll();
	}

	public List<Article> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public Article getById(Long id) {
		return dao.getById(id);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public Article findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public Article findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
