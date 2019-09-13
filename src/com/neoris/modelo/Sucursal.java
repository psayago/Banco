package com.neoris.modelo;

public class Sucursal {

	private int nroSucursal;
	private String provincia;
	private String localidad;
	private String nombre;
	private String direccion;
	
	
	
	public Sucursal(int nroSucursal, String provincia, String localidad, String nombre,
			String direccion) {
		super();
		this.nroSucursal = nroSucursal;
		this.provincia = provincia;
		this.localidad = localidad;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	
	public int getNroSucursal() {
		return nroSucursal;
	}
	public void setNroSucursal(int nroSucursal) {
		this.nroSucursal = nroSucursal;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	

}
