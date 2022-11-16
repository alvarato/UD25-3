package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Almacen;

public interface AlmacenDAO extends JpaRepository<Almacen, Integer>{

}
