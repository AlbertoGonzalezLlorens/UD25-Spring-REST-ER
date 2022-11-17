package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Articulos;

public interface IArticulosService {

	// Metodos del CRUD

	public List<Articulos> listarArticulos(); // Listar All

	public Articulos crearArticulos(Articulos articulo); // CREATE

	public Articulos leerArticulos(int id); // READ

	public Articulos actualizarArticulos(Articulos articulo); // UPDATE

	public void borrarArticulos(int id); // DELETE

}