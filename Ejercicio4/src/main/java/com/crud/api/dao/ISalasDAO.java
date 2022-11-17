package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Salas;

public interface ISalasDAO extends JpaRepository<Salas, Integer> {

}