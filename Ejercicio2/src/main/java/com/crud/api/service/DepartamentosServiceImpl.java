package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IDepartamentosDAO;
import com.crud.api.dto.Departamentos;

@Service
public class DepartamentosServiceImpl implements IDepartamentosService{

	@Autowired
	IDepartamentosDAO iDepartamentosDAO;
	
	@Override
	public List<Departamentos> listarDepartamentos() {
		
		return iDepartamentosDAO.findAll();
	}
	
	@Override
	public Departamentos guardarDepartamentos(Departamentos departamento) {
		
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public Departamentos departamentoXID(Long codigo) {
		
		return iDepartamentosDAO.findById(codigo).get();
	}

	@Override
	public Departamentos actualizarDepartamentos(Departamentos departamento) {
		
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamentos(Long codigo) {
		
		iDepartamentosDAO.deleteById(codigo);
		
	}
}
