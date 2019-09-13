package com.neoris.interfaces;

import java.util.List;

import com.neoris.modelo.Sucursal;

public interface SucursalService <T extends Sucursal>{
	
	public void insertSucursal(T sucursal);
	
	public List<Sucursal> getAll();

}
