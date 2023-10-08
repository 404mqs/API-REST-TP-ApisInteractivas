package com.example.demo.models;

import jakarta.*;

import jakarta.persistence.*;

@Entity
@Table(name = "reclamo")
public class Reclamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idReclamo")
	private int idReclamo;
	private String usuario;
	private String edificio;
	private String departamento;
	private String espacioComun;
	private String descripcion;
	private String foto;
	private String estadoReclamo;
	private String respuesta;
	
	public int getIdReclamo() {
		return idReclamo;
	}
	
	public void setIdReclamo(int idReclamo) {
		this.idReclamo = idReclamo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEspacioComun() {
		return espacioComun;
	}
	public void setEspacioComun(String espacioComun) {
		this.espacioComun = espacioComun;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getEstadoReclamo() {
		return estadoReclamo;
	}
	public void setEstadoReclamo(String estadoReclamo) {
		this.estadoReclamo = estadoReclamo;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	
	
	
	
}
