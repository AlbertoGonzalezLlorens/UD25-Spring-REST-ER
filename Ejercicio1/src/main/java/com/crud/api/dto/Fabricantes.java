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
@Table(name="fabricantes")
public class Fabricantes {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="fabricante")
	private List<Articulos> articulos;
	
	//Constructores
	public Fabricantes() {
		
	}
	
	public Fabricantes(int id, String nombre) {
		this.id=id;
		this.nombre=nombre;
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
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fabricante")
	public List<Articulos> getArticulo() {
		return articulos;
	}

	public void setArticulo(List<Articulos> articulo) {
		this.articulos = articulo;
	}

	@Override
	public String toString() {
		return "Fabricante [id = " + id +", nombre = " + nombre +"] ";
	}
}