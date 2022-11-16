package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.CajaDAO;
import com.pacoteck.springboot.app.dto.Caja;

@Service
public class CajaServiceImp implements ICajaService{
	
	@Autowired
	CajaDAO dao;

	@Override
	public void create(Caja entity) {
		dao.save(entity);
		
	}

	@Override
	public void update(Caja entity) {
		List<Caja> aux = dao.findAll();
		for (Caja caja : aux) {
			if(caja.getNumReferencia().equals(entity.getNumReferencia())) {
				dao.save(entity);
			}
		}
	}

	@Override
	public List<Caja> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(String id) {
		dao.deleteById(id);
	}
}
