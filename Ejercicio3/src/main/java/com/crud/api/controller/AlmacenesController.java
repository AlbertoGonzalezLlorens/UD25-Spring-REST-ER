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
import com.crud.api.dto.Almacenes;
import com.crud.api.service.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {
	
	@Autowired
	AlmacenesServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes(){
		return almacenServiceImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacenes salvarAlmacenes(@RequestBody Almacenes almacen) {
		
		return almacenServiceImpl.guardarAlmacenes(almacen);
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacenes almacenXID(@PathVariable(name="codigo") Long codigo) {
		
		Almacenes almacen_xid= new Almacenes();
		
		almacen_xid=almacenServiceImpl.almacenXID(codigo);
		
		System.out.println("Almacen XID: "+almacen_xid);
		
		return almacen_xid;
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacenes actualizarAlmacenes(@PathVariable(name="codigo")Long codigo,@RequestBody Almacenes almacen) {
		
		Almacenes almacen_seleccionado= new Almacenes();
		Almacenes almacen_actualizado= new Almacenes();
		
		almacen_seleccionado= almacenServiceImpl.almacenXID(codigo);
		
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		
		almacen_actualizado = almacenServiceImpl.actualizarAlmacenes(almacen_seleccionado);
		
		System.out.println("El almacen actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacenes(@PathVariable(name="codigo")Long codigo) {
		almacenServiceImpl.eliminarAlmacenes(codigo);
	}
	
	
}
