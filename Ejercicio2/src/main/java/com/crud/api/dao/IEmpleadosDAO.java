package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.api.dto.Empleados;

public interface IEmpleadosDAO extends JpaRepository<Empleados,String>{

}
