package com.crud.api.service;

import java.util.List;
import com.crud.api.dto.Fabricante;

public interface IFabricanteService {

	//Metodos del CRUD
	public List<Fabricante> listarFabricantes(); //Listar All 
	
	public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un fabricante CREATE
	
	public Fabricante fabricanteXID(Long codigo); //Leer datos de un fabricante READ
	
	public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del fabricante UPDATE
	
	public void eliminarFabricante(Long codigo);// Elimina el fabricante DELETE
	
	
}
