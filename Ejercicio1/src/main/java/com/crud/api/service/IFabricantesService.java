package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Fabricantes;

public interface IFabricantesService {

	// Metodos del CRUD

	public List<Fabricantes> listarFabricantes(); // Listar All

	public Fabricantes crearFabricantes(Fabricantes fabricante); // CREATE

	public Fabricantes leerFabricantes(int id); // READ

	public Fabricantes actualizarFabricantes(Fabricantes fabricante); // UPDATE

	public void borrarFabricantes(int id);// DELETE

}