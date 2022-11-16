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
import com.crud.api.dto.Fabricante;
import com.crud.api.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServideImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServideImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante salvarFabricante(Fabricante fabricante) {
		
		return fabricanteServideImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{codigo}")
	public Fabricante fabricanteXID(@PathVariable(name="codigo") Long codigo) {
		
		Fabricante fabricante_xid= new Fabricante();
		
		fabricante_xid=fabricanteServideImpl.fabricanteXID(codigo);
		
		System.out.println("Fabricante XID: "+fabricante_xid);
		
		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{codigo}")
	public Fabricante actualizarFabricante(@PathVariable(name="codigo")Long codigo,Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado= new Fabricante();
		Fabricante fabricante_actualizado= new Fabricante();
		
		fabricante_seleccionado= fabricanteServideImpl.fabricanteXID(codigo);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricanteServideImpl.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{codigo}")
	public void eleiminarFabricante(@PathVariable(name="codigo")Long codigo) {
		fabricanteServideImpl.eliminarFabricante(codigo);
	}
	
	
}
