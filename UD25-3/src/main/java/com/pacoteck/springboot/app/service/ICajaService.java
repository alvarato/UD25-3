package com.pacoteck.springboot.app.service;

import java.util.List;
import com.pacoteck.springboot.app.dto.Caja;

public interface ICajaService {

	public void create(Caja entity);
	public void update(Caja entity);
	public List<Caja> findAll();
	public void deleteById(String id);
}
