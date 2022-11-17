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

import com.crud.api.dto.Fabricantes;
import com.crud.api.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorFabricantes {

	@Autowired
	FabricantesServiceImpl fabricantesServiceImpl;

	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes() {
		return fabricantesServiceImpl.listarFabricantes();
	}

	@PostMapping("/fabricantes")
	public Fabricantes crearFabricante(@RequestBody Fabricantes fabricante) {
		return fabricantesServiceImpl.crearFabricantes(fabricante);

	}

	@GetMapping("/fabricantes/{id}")
	public Fabricantes leerFabricante(@PathVariable(name = "id") int id) {

		Fabricantes fabricante = new Fabricantes();

		fabricante = fabricantesServiceImpl.leerFabricantes(id);

		System.out.println("Fabricante segun ID: " + fabricante);

		return fabricante;
	}

	@PutMapping("/fabricantes/{id}")
	public Fabricantes actualizarFabricante(@PathVariable(name = "id") int id, @RequestBody Fabricantes fabricante) {

		Fabricantes fabricante_seleccionado = new Fabricantes();
		Fabricantes fabricante_actualizado = new Fabricantes();

		fabricante_seleccionado = fabricantesServiceImpl.leerFabricantes(id);

		fabricante_seleccionado.setNombre(fabricante.getNombre());

		fabricante_actualizado = fabricantesServiceImpl.actualizarFabricantes(fabricante_seleccionado);

		System.out.println("El fabricante actualizado es: " + fabricante_actualizado);

		return fabricante_actualizado;
	}

	@DeleteMapping("/fabricantes/{id}")
	public void borrarFabricante(@PathVariable(name = "id") int id) {
		fabricantesServiceImpl.borrarFabricantes(id);
	}

}