package com.neoris.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.neoris.dao.connection.MySqlDb;
import com.neoris.interfaces.SucursalService;
import com.neoris.modelo.Sucursal;

public class SucursalServiceImp implements SucursalService<Sucursal>{

	private MySqlDb conn;
	
	public SucursalServiceImp() {
		this.conn = new MySqlDb();
	}

	@Override
	public void insertSucursal(Sucursal sucursal) {
		
			String query = "insert into jugadores (nrosucursal,provincia,localidad,nombre,direccion) values (?,?,?,?,?,?)";
			PreparedStatement ps;
			try {
				ps = (PreparedStatement) conn.getConnection().prepareStatement(query);
				ps.setInt(1, sucursal.getNroSucursal());
				ps.setString(2, sucursal.getProvincia());
				ps.setString(3, sucursal.getLocalidad());
				ps.setString(4, sucursal.getNombre());
				ps.setString(5, sucursal.getDireccion());
				ps.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		
//		finally {
//			try {
//				this.conn.getConnection().close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		
	}

	@Override
	public List<Sucursal> getAll()  {
		Sucursal sucursal = null;
		List<Sucursal> lista = new ArrayList<Sucursal>();
		String sql = "select * from sucursales";
		
		try {	
		Statement st = (Statement) conn.getConnection().createStatement();

			ResultSet rs = st.executeQuery(sql);
            
            	
            	while (rs.next()) {
    				sucursal = new Sucursal(rs.getInt("nrosucursal"), rs.getString("provincia"), rs.getString("localidad"),
    						rs.getString("nombre"), rs.getString("direccion"));
    				lista.add(sucursal);
    			}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			

		

		return lista;
		
	}

}
