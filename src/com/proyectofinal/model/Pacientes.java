package com.proyectofinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pacientes")
public class Pacientes {
	
	@Id
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="NSS")
	private int NSS;
	
	@Column(name="nom_responsable")
	private String nom_responsable;
	
	public Pacientes() {
		
	}
	
	public Pacientes(String nombre, String apellido, int nSS, String nom_responsable) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		NSS = nSS;
		this.nom_responsable = nom_responsable;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNSS() {
		return NSS;
	}
	public void setNSS(int nSS) {
		NSS = nSS;
	}
	public String getNom_responsable() {
		return nom_responsable;
	}
	public void setNom_responsable(String nom_responsable) {
		this.nom_responsable = nom_responsable;
	}
	
	
	

}
