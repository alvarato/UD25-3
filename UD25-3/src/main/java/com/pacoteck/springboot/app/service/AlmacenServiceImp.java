package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.AlmacenDAO;
import com.pacoteck.springboot.app.dto.Almacen;

@Service
public class AlmacenServiceImp implements IAlmacenService{

	@Autowired
	AlmacenDAO dao;

	@Override
	public void create(Almacen entity) {
		dao.save(entity);
		
	}

	@Override
	public void update(Almacen entity) {
		List<Almacen> aux = dao.findAll();
		for (Almacen almacen : aux) {
			if(almacen.getCodigo() == entity.getCodigo()) {
				dao.save(entity);
			}
		}
		
	}

	@Override
	public List<Almacen> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}
}
