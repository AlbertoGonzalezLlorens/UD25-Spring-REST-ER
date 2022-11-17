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
@Table(name="cajas")
public class Cajas {
	@Id
	@Column(name = "numreferencia")
	private String numreferencia;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne
    @JoinColumn(name="almacen")
    private Almacenes almacen;
	
	public Cajas() {
		
	}
	
	public Cajas(String numreferencia, String contenido, int valor, Almacenes almacen) {
		//super();
		this.numreferencia = numreferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public String getNumreferencia() {
		return numreferencia;
	}

	public void setNumreferencia(String numreferencia) {
		this.numreferencia = numreferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacenes getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}

	
}
