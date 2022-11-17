package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IFabricantesDAO;
import com.crud.api.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements IFabricantesService {

	@Autowired
	IFabricantesDAO iFabricanteDAO;

	@Override
	public List<Fabricantes> listarFabricantes() {
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricantes crearFabricantes(Fabricantes fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricantes leerFabricantes(int id) {
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricantes(Fabricantes fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void borrarFabricantes(int id) {
		iFabricanteDAO.deleteById(id);
	}

}