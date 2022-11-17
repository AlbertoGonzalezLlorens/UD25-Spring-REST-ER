package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Peliculas;

public interface IPeliculasService {

	// Metodos del CRUD

	public List<Peliculas> listarPeliculas(); // Listar All

	public Peliculas crearPeliculas(Peliculas pelicula); // CREATE

	public Peliculas leerPeliculas(int id); // READ

	public Peliculas actualizarPeliculas(Peliculas pelicula); // UPDATE

	public void borrarPeliculas(int id);// DELETE

}