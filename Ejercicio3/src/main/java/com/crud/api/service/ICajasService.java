package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Cajas;

public interface ICajasService {

	//Metodos del CRUD
		public List<Cajas> listarCajas(); //Listar All 
		
		public Cajas guardarCajas(Cajas caja);	//Guarda un video CREATE
		
		public Cajas cajaXID(String numreferencia); //Leer datos de un video READ
		
		public Cajas actualizarCajas(Cajas caja); //Actualiza datos del video UPDATE
		
		public void eliminarCajas(String numreferencia);// Elimina el video DELETE
}
