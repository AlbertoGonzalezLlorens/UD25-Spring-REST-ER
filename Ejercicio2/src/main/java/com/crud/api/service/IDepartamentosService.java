package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Departamentos;

public interface IDepartamentosService {

	//Metodos del CRUD
		public List<Departamentos> listarDepartamentos(); //Listar All 
		
		public Departamentos guardarDepartamentos(Departamentos departamento);	//Guarda un video CREATE
		
		public Departamentos departamentoXID(Long codigo); //Leer datos de un video READ
		
		public Departamentos actualizarDepartamentos(Departamentos departamento); //Actualiza datos del video UPDATE
		
		public void eliminarDepartamentos(Long codigo);// Elimina el video DELETE
}
