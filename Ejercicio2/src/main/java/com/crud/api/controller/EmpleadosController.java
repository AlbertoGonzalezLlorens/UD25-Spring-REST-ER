package com.crud.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.api.dto.Empleados;
import com.crud.api.service.EmpleadosServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadosController {
	
	@Autowired
	EmpleadosServiceImpl empleadoServideImpl;
	
	@GetMapping("/empleados")
	public List<Empleados> listarEmpleados(){
		return empleadoServideImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleados salvarEmpleado(@RequestBody Empleados empleado) {
		
		return empleadoServideImpl.guardarEmpleados(empleado);
	}
	
	@GetMapping("/empleados/{dni}")
	public Empleados empleadoXID(@PathVariable(name="dni") String dni) {
		
		Empleados empleado_xid= new Empleados();
		
		empleado_xid=empleadoServideImpl.empleadoXID(dni);
		
		System.out.println("Empleado XID: "+empleado_xid);
		
		return empleado_xid;
	}
	
	@PutMapping("/empleados/{dni}")
	public Empleados actualizarEmpleado(@PathVariable(name="dni")String dni,@RequestBody Empleados empleado) {
		
		Empleados empleado_seleccionado= new Empleados();
		Empleados empleado_actualizado= new Empleados();
		
		empleado_seleccionado= empleadoServideImpl.empleadoXID(dni);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
	
		
		empleado_actualizado = empleadoServideImpl.actualizarEmpleados(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{dni}")
	public void eleiminarEmpleado(@PathVariable(name="dni")String dni) {
		empleadoServideImpl.eliminarEmpleados(dni);
	}
	
	
}
