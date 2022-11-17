package com.crud.api.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="almacenes")
public class Almacenes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "capacidad")
	private int capacidad;
	
    @OneToMany
    @JoinColumn(name="codigo")
    private List<Cajas> caja;
	    
	  //Constructores
		
	public Almacenes() {
		
	}
		
	public Almacenes(Long codigo, String lugar, int capacidad ) {
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad=capacidad;
	}

	//Getters y Setters

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Cajas> getCajas() {
		return caja;
	}


	public void setCajas(List<Cajas> caja) {
		this.caja = caja;
	}
		
}
