package com.crud.api.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="peliculas")
public class Peliculas {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int clasificacionedad;
	
	@OneToMany
	@JoinColumn(name="pelicula")
	private List<Salas> salas;
	
	//Constructores
	public Peliculas() {
		
	}
	
	public Peliculas(int id, String nombre, int clasificacionedad) {
		this.id=id;
		this.nombre=nombre;
		this.clasificacionedad=clasificacionedad;
	}

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
	
	public int getClasificacionedad() {
		return clasificacionedad;
	}

	public void setClasificacionedad(int clasificacionedad) {
		this.clasificacionedad = clasificacionedad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pelicula")
	public List<Salas> getSala() {
		return salas;
	}

	public void setSala(List<Salas> sala) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", nombre=" + nombre + ", clasificacionedad=" + clasificacionedad +"]";
	}
}