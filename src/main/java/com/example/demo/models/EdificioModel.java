package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Edificio")
public class EdificioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEdificio;
	
	private String calle;
	private int altura;
	
	public int getIdEdificio() {
		return idEdificio;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setIdEdificio(int int1) {
		// TODO Auto-generated method stub
		this.idEdificio=int1;
		
	}


	
	
}