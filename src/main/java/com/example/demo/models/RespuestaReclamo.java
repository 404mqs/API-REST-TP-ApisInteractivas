package com.example.demo.models;

import jakarta.*;

import jakarta.persistence.*;

@Entity
@Table(name = "respuestareclamo")
public class RespuestaReclamo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRespuesta")
	private int idRespuesta;
	
	private String reclamo;
	
	private String descripcion;

	public int getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(int idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public String getReclamo() {
		return reclamo;
	}

	public void setReclamo(String reclamo) {
		this.reclamo = reclamo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	


	
}
