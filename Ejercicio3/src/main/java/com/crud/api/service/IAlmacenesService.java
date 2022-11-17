package com.crud.api.service;

import java.util.List;
import com.crud.api.dto.Almacenes;

public interface IAlmacenesService {

	public List<Almacenes> listarAlmacenes();
	
	public Almacenes guardarAlmacenes(Almacenes almacen);
	
	public Almacenes almacenXID(Long codigo); 
	
	public Almacenes actualizarAlmacenes(Almacenes almacen);
	
	public void eliminarAlmacenes(Long codigo);
	
	
}
