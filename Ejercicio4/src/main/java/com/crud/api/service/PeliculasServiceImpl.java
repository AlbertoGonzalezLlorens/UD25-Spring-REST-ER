package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IPeliculasDAO;
import com.crud.api.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService {

	@Autowired
	IPeliculasDAO iPeliculasDAO;

	@Override
	public List<Peliculas> listarPeliculas() {
		return iPeliculasDAO.findAll();
	}

	@Override
	public Peliculas crearPeliculas(Peliculas pelicula) {
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public Peliculas leerPeliculas(int id) {
		return iPeliculasDAO.findById(id).get();
	}

	@Override
	public Peliculas actualizarPeliculas(Peliculas pelicula) {
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public void borrarPeliculas(int id) {
		iPeliculasDAO.deleteById(id);
	}

}