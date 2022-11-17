package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Fabricantes;

public interface IFabricantesDAO extends JpaRepository<Fabricantes, Integer> {

}