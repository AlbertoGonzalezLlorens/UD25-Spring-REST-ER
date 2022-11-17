package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Salas;

public interface ISalasService {

	// Metodos del CRUD

	public List<Salas> listarSalas(); // Listar All

	public Salas crearSalas(Salas sala); // CREATE

	public Salas leerSalas(int id); // READ

	public Salas actualizarSalas(Salas sala); // UPDATE

	public void borrarSalas(int id); // DELETE

}