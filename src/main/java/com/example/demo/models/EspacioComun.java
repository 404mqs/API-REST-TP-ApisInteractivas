package com.example.demo.models;

import jakarta.*;

import jakarta.persistence.*;

@Entity
@Table(name = "espaciocomun")
public class EspacioComun{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEspacioComun")
	private int idEspacioComun;
	

	private String edificio;
	
	private int piso;
	private String nombre;
	private String descripcion;
	
	public int getIdEspacioComun() {
		return idEspacioComun;
	}
	public void setIdEspacioComun(int idEspacioComun) {
		this.idEspacioComun = idEspacioComun;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
}
