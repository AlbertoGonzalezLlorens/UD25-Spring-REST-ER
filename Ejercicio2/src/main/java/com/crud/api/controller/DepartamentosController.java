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

import com.crud.api.dto.Departamentos;
import com.crud.api.service.DepartamentosServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentosController {

	@Autowired
	DepartamentosServiceImpl departamentoServideImpl;
	
	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos(){
		return departamentoServideImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamentos salvarDepartamento(@RequestBody Departamentos departamento) {
		
		return departamentoServideImpl.guardarDepartamentos(departamento);
	}
	
	@GetMapping("/departamentos/{codigo}")
	public Departamentos departamentoXID(@PathVariable(name="codigo") Long codigo) {
		
		Departamentos departamento_xid= new Departamentos();
		
		departamento_xid=departamentoServideImpl.departamentoXID(codigo);
		
		System.out.println("Departamento XID: "+departamento_xid);
		
		return departamento_xid;
	}
	
	@PutMapping("/departamentos/{codigo}")
	public Departamentos actualizarDepartamento(@PathVariable(name="codigo")Long codigo,@RequestBody Departamentos departamento) {
		
		Departamentos departamento_seleccionado= new Departamentos();
		Departamentos departamento_actualizado= new Departamentos();
		
		departamento_seleccionado= departamentoServideImpl.departamentoXID(codigo);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentoServideImpl.actualizarDepartamentos(departamento_seleccionado);
		
		System.out.println("El departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento(@PathVariable(name="codigo")Long codigo) {
		departamentoServideImpl.eliminarDepartamentos(codigo);
	}
	
}
