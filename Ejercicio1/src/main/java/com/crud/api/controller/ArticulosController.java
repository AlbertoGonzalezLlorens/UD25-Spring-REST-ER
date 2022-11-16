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

import com.crud.api.dto.Articulos;
import com.crud.api.service.ArticulosServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServiceImpl articuloServideImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticuloss(){
		return articuloServideImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulos salvarArticulos( Articulos articulo) {
		
		return articuloServideImpl.guardarArticulos(articulo);
	}
	
	@GetMapping("/articulos/{codigo}")
	public Articulos articuloXID(@PathVariable(name="codigo") Long codigo) {
		
		Articulos articulo_xid= new Articulos();
		
		articulo_xid=articuloServideImpl.articuloXID(codigo);
		
		System.out.println("Articulos XID: "+articulo_xid);
		
		return articulo_xid;
	}
	
	@PutMapping("/articulos/{codigo}")
	public Articulos actualizarArticulos(@PathVariable(name="codigo")Long codigo, Articulos articulo) {
		
		Articulos articulo_seleccionado= new Articulos();
		Articulos articulo_actualizado= new Articulos();
		
		articulo_seleccionado= articuloServideImpl.articuloXID(codigo);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		articulo_actualizado = articuloServideImpl.actualizarArticulos(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarArticulos(@PathVariable(name="codigo")Long codigo) {
		articuloServideImpl.eliminarArticulos(codigo);
	}
	
}
