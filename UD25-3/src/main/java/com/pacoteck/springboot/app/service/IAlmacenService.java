package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Almacen;

public interface IAlmacenService {

	public void create(Almacen entity);
	public void update(Almacen entity);
	public List<Almacen> findAll();
	public void deleteById(int id);
}
