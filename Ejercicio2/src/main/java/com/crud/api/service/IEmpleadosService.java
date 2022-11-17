package com.crud.api.service;

import java.util.List;
import com.crud.api.dto.Empleados;

public interface IEmpleadosService {

	public List<Empleados> listarEmpleados();
	
	public Empleados guardarEmpleados(Empleados empleado);	//Guarda un CREATE
	
	public Empleados empleadoXID(String dni); //Leer datos de un READ
	
	public Empleados actualizarEmpleados(Empleados empleado); //Actualiza datos del  UPDATE
	
	public void eliminarEmpleados(String dni);// Elimina el  DELETE
	
	
}
