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

import com.crud.api.dto.Articulos;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="fabricante")//en caso que la tabla sea diferente

public class Fabricante {
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long codigo;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		
	    @OneToMany
	    @JoinColumn(name="codigo")
	    private List<Articulos> articulo;
	    
	  //Constructores
		
		public Fabricante() {
		
		}
		
		public Fabricante(Long codigo, String nombre) {
			this.codigo = codigo;
			this.nombre = nombre;
		}

		//Getters y Setters
		
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

		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
		public List<Articulos> getArticulos() {
			return articulo;
		}

		/**
		 * @param video the video to set
		 */
		public void setArticulos(List<Articulos> articulo) {
			this.articulo = articulo;
		}

		@Override
		public String toString() {
			return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + ", articulo=" + articulo + "]";
		}
		
		
}
