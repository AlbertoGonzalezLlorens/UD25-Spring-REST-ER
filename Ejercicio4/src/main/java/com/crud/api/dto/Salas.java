package com.crud.api.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salas") 
public class Salas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "pelicula")
	private Peliculas pelicula;
 
	// Constructores

	public Salas() {
	}

	public Salas(int id, String nombre, Peliculas pelicula) {
		this.id = id;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	// Setters y getters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Salas [id=" + id + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}
}