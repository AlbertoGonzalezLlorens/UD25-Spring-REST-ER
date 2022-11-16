package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.api.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Long>{

}
