package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.api.dto.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos, Long>{

}
