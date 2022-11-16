package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Articulos;

public interface IArticulosService {

	//Metodos del CRUD
		public List<Articulos> listarArticulos(); //Listar All 
		
		public Articulos guardarArticulos(Articulos articulo);	//Guarda un articulo CREATE
		
		public Articulos articuloXID(Long codigo); //Leer datos de un articulo READ
		
		public Articulos actualizarArticulos(Articulos articulo); //Actualiza datos del articulo UPDATE
		
		public void eliminarArticulos(Long codigo);// Elimina el articulo DELETE
}
