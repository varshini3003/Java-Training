package DataAccessObjects;

import DataTransferObjects.ItemMasterDTO;
import java.sql.*;
import java.util.*;

public class Items implements ItemMasterDAO{
	public ItemMasterDTO findById(int number) {
		try {
			Connection connection  = DBUtility.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from item_master where itemno =?");
			statement.setInt(1, number);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				ItemMasterDTO item = new ItemMasterDTO();
				item.setItemno(number);
				item.setItemname(rs.getString("itemname"));
				item.setItemprice(rs.getInt("itemprice"));
				item.setUnit(rs.getString("unit"));	
				return item;
			}	
				
		} catch (Exception e) {
			DBUtility.closeConnection(e);
		}	
		return null;
	}

	@Override
	public ItemMasterDTO findByName(String name) {
		
		try {
			Connection connection  = DBUtility.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from item_master where itemname =?");
			statement.setString(1, name);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				ItemMasterDTO item = new ItemMasterDTO();
				item.setItemno(rs.getInt("itemno"));
				item.setItemname(name);
				item.setItemprice(rs.getInt("itemprice"));
				item.setUnit(rs.getString("unit"));		
				return item;
			}
				
		} catch (Exception e) {
			DBUtility.closeConnection(e);
		}
		return null;
	}
	
	@Override
	public Collection<ItemMasterDTO> findAll() {
		try {
			Connection connection  = DBUtility.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from item_master ");
			ResultSet rs = statement.executeQuery();
			List<ItemMasterDTO> items = new ArrayList<>();
			while(rs.next()) {
				ItemMasterDTO item = new ItemMasterDTO();
				item.setItemname(rs.getString("itemname"));
				item.setItemno(rs.getInt("itemno"));
				item.setItemprice(rs.getInt("itemprice"));
				item.setUnit(rs.getString("unit"));
				items.add(item);
			}
			return items;
								
		} 
		catch (Exception e) {
			DBUtility.closeConnection(e);
		}
		
		return null;
	}

	@Override
	public int updateItem(ItemMasterDTO item) {
		
		try {
			Connection connection  = DBUtility.getConnection();
			int id= item.getItemno();
			
			PreparedStatement statement =connection.prepareStatement("select * from item_master where itemno= ?;");
		
			statement.setInt(1, id);
			
			ResultSet rs = statement.executeQuery();
				
			if(rs.next()) {
				statement = connection.prepareStatement("update items set itemname =? , itemprice= ? , unit = ? where itemno =?;");
				statement.setString(1, item.getItemname());
				statement.setInt(2, item.getItemprice());
				statement.setString(3, item.getUnit());
				statement.setInt(4, item.getItemno());
				
				 int n = statement.executeUpdate();
				 DBUtility.closeConnection(null);
				 return n;
			}
			return 0;
			
			
		} catch (Exception e) {
			DBUtility.closeConnection(e);
		}
		
		return 0;
	}

	@Override
	public int deleteById(int number) {
	
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from item_master where itemno=?;");
			ps.setInt(1, number);
			int n = ps.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	@Override
	public int deleteByName(String name) {
		
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from item_master where item_name=?;");
			ps.setString(1, name);
			int n = ps.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

}
