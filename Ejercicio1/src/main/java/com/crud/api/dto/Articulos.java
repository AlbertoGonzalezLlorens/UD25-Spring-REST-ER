package com.crud.api.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="articulos")//en caso que la tabla sea diferente
public class Articulos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long codigo;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;
	
	@ManyToOne
    @JoinColumn(name="fabricante")
    private Fabricante fabricante;
	
	public Articulos() {
		
	}
	
	public Articulos(Long codigo, String nombre, int precio, Fabricante fabricante) {
		//super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fabricante="
				+ fabricante + "]";
	}
	
	
}
