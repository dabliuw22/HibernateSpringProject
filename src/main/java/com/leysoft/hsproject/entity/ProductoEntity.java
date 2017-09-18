package com.leysoft.hsproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name = "productos")
public class ProductoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 20)
	private String nombre;
	
	private double precio;
	
	@ManyToOne @JoinColumn(name = "tipo_producto_id")
	private TipoProductoEntity tipoProducto;

	public ProductoEntity() {}

	public ProductoEntity(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public TipoProductoEntity getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProductoEntity tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
}
