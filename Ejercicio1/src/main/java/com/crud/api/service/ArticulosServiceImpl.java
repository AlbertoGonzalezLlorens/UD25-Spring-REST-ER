package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IArticulosDAO;
import com.crud.api.dto.Articulos;

@Service
public class ArticulosServiceImpl implements IArticulosService{
	
	//Utilizamos los metodos de la interface IArticulosDAO, es como si instaciaramos.
	@Autowired
	IArticulosDAO iArticulosDAO;
	
	@Override
	public List<Articulos> listarArticulos() {
		
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulos(Articulos articulo) {
		
		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulos articuloXID(Long codigo) {
		
		return iArticulosDAO.findById(codigo).get();
	}

	@Override
	public Articulos actualizarArticulos(Articulos articulo) {
		
		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulos(Long codigo) {
		
		iArticulosDAO.deleteById(codigo);
		
	}

}
