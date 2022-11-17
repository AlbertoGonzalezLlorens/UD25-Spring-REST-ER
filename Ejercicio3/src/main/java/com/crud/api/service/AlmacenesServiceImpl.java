package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IAlmacenesDAO;
import com.crud.api.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IAlmacenesDAO iAlmacenesDAO;
	
	@Override
	public List<Almacenes> listarAlmacenes() {
		
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacenes(Almacenes almacen) {
		
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public Almacenes almacenXID(Long codigo) {
		
		return iAlmacenesDAO.findById(codigo).get();
	}

	@Override
	public Almacenes actualizarAlmacenes(Almacenes almacen) {
		
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacenes(Long codigo) {
		
		iAlmacenesDAO.deleteById(codigo);
		
	}

}
