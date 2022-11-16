package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Caja;

public interface CajaDAO extends JpaRepository<Caja, String>{

}
