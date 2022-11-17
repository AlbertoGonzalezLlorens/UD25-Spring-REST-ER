package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IArticulosDAO;
import com.crud.api.dto.Articulos;

@Service
public class ArticulosServiceImpl implements IArticulosService {

	@Autowired
	IArticulosDAO iArticuloDAO;

	@Override
	public List<Articulos> listarArticulos() {
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulos crearArticulos(Articulos articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulos leerArticulos(int id) {
		return iArticuloDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulos(Articulos articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void borrarArticulos(int id) {
		iArticuloDAO.deleteById(id);
	}

}