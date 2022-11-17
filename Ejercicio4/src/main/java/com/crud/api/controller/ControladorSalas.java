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

import com.crud.api.dto.Salas;
import com.crud.api.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorSalas {

	@Autowired
	SalasServiceImpl salasServiceImpl;

	@GetMapping("/salas")
	public List<Salas> listarSalas() {
		return salasServiceImpl.listarSalas();
	}

	@PostMapping("/salas")
	public Salas crearSalas(@RequestBody Salas salas) {

		return salasServiceImpl.crearSalas(salas);

	}

	@GetMapping("/salas/{id}")
	public Salas leerSalas(@PathVariable(name = "id") int id) {

		Salas salas = new Salas();

		salas = salasServiceImpl.leerSalas(id);

		System.out.println("Articulo segun ID: " + salas);

		return salas;
	}

	@PutMapping("/salas/{id}")
	public Salas actualizarSalas(@PathVariable(name = "id") int id, @RequestBody Salas salas) {

		Salas salas_seleccionado = new Salas();
		Salas salas_actualizado = new Salas();

		salas_seleccionado = salasServiceImpl.leerSalas(id);

		salas_seleccionado.setNombre(salas.getNombre());
		salas_seleccionado.setPelicula(salas.getPelicula());

		salas_actualizado = salasServiceImpl.actualizarSalas(salas_seleccionado);

		System.out.println("El salas actualizado es: " + salas_actualizado);

		return salas_actualizado;
	}

	@DeleteMapping("/salas/{id}")
	public void borrarSalas(@PathVariable(name = "id") int id) {
		salasServiceImpl.borrarSalas(id);
	}

}