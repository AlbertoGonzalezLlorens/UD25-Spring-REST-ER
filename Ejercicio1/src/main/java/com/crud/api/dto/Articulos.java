package com.crud.api.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articulos") 
public class Articulos {

	// Atributos de la entidad Empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int precio;
	

	@ManyToOne
	@JoinColumn(name = "fabricante")
	private Fabricantes fabricante;
 
	// Constructores

	public Articulos() {
	}

	public Articulos(int id, String nombre, int precio, Fabricantes fabricante) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricantes getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricantes fabricante) {
		this.fabricante = fabricante;
	}

	// To string personalizado
	@Override
	public String toString() {
		return "Empleado [id = " + id + ", nombre = " + nombre + ", precio " + precio + ", fabricante" + fabricante
				+ " ] ";
	}
}