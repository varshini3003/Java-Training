package DataAccessObjects;

import java.util.Collection;

import DataTransferObjects.ItemMasterDTO;

public interface ItemMasterDAO {
	public ItemMasterDTO findById(int itemno);
	public ItemMasterDTO findByName(String itemname);
	public Collection<ItemMasterDTO> findAll();
	public int  updateItem(ItemMasterDTO item);
	public int deleteById(int itemno);
	public int deleteByName(String itemname);
}
