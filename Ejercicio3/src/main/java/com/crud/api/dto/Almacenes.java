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

import com.crud.api.dto.Cajas;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="almacen")//en caso que la tabla sea diferente

public class Almacenes {
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long codigo;
		@Column(name = "lugar")//no hace falta si se llama igual
		private String lugar;
		@Column(name = "capacidad")//no hace falta si se llama igual
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
