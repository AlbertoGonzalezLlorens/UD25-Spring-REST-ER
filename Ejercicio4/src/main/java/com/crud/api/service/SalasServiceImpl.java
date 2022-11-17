package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.ISalasDAO;
import com.crud.api.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService {

	@Autowired
	ISalasDAO iSalasDAO;

	@Override
	public List<Salas> listarSalas() {
		return iSalasDAO.findAll();
	}

	@Override
	public Salas crearSalas(Salas sala) {
		return iSalasDAO.save(sala);
	}

	@Override
	public Salas leerSalas(int id) {
		return iSalasDAO.findById(id).get();
	}

	@Override
	public Salas actualizarSalas(Salas sala) {
		return iSalasDAO.save(sala);
	}

	@Override
	public void borrarSalas(int id) {
		iSalasDAO.deleteById(id);
	}

}