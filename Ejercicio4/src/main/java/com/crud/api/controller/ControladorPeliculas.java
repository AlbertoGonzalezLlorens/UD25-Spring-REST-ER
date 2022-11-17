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

import com.crud.api.dto.Peliculas;
import com.crud.api.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorPeliculas {

	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;

	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas() {
		return peliculasServiceImpl.listarPeliculas();
	}

	@PostMapping("/peliculas")
	public Peliculas crearPeliculas(@RequestBody Peliculas peliculas) {
		return peliculasServiceImpl.crearPeliculas(peliculas);

	}

	@GetMapping("/peliculas/{id}")
	public Peliculas leerPeliculas(@PathVariable(name = "id") int id) {

		Peliculas peliculas = new Peliculas();

		peliculas = peliculasServiceImpl.leerPeliculas(id);

		System.out.println("Fabricante segun ID: " + peliculas);

		return peliculas;
	}

	@PutMapping("/peliculas/{id}")
	public Peliculas actualizarFabricante(@PathVariable(name = "id") int id, @RequestBody Peliculas peliculas) {

		Peliculas peliculas_seleccionado = new Peliculas();
		Peliculas peliculas_actualizado = new Peliculas();

		peliculas_seleccionado = peliculasServiceImpl.leerPeliculas(id);

		peliculas_seleccionado.setNombre(peliculas.getNombre());
		peliculas_seleccionado.setClasificacionedad(peliculas.getClasificacionedad());

		peliculas_actualizado = peliculasServiceImpl.actualizarPeliculas(peliculas_seleccionado);

		System.out.println("El fabricante actualizado es: " + peliculas_actualizado);

		return peliculas_actualizado;
	}

	@DeleteMapping("/peliculas/{id}")
	public void borrarPeliculas(@PathVariable(name = "id") int id) {
		peliculasServiceImpl.borrarPeliculas(id);
	}

}