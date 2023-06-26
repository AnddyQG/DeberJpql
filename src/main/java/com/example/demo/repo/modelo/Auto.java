package com.example.demo.repo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "auto")
public class Auto {
@Id
@GeneratedValue(generator = "seq_auto", strategy = GenerationType.SEQUENCE)
@SequenceGenerator(name = "seq_auto", sequenceName = "seq_auto", allocationSize = 1)
@Column(name = "auto_id")
	private Integer id;
@Column(name = "auto_placa")
	private String placa;
	@Column(name = "auto_marca")
	private String marca;
	@Column(name = "auto_modelo")
	private String modelo;
	@Override
	public String toString() {
		return "Auto [id=" + id + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getId() {
		return id;
	}
	
	
	
	
}
