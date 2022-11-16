package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IEmpleadosDAO;
import com.crud.api.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IEmpleadosDAO iEmpleadosDAO;
	
	@Override
	public List<Empleados> listarEmpleados() {
		
		return iEmpleadosDAO.findAll();
	}

	@Override
	public Empleados guardarEmpleados(Empleados empleado) {
		
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public Empleados empleadoXID(String dni) {
		
		return iEmpleadosDAO.findById(dni).get();
	}

	@Override
	public Empleados actualizarEmpleados(Empleados empleado) {
		
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleados(String dni) {
		
		iEmpleadosDAO.deleteById(dni);
		
	}

}
