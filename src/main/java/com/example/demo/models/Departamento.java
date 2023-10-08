package com.example.demo.models;

import jakarta.*;

import jakarta.persistence.*;

@Entity
@Table(name = "Departamento")
public class Departamento{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDepartamento")
	private int idDepartamento;
	
	private String piso;
	
	private String unidad;
	
	private String propietario;

	private String edificio;
	
	private String alquiler;

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(String alquiler) {
		this.alquiler = alquiler;
	}
	
}
