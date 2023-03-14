package DataAccessObjects;

import java.sql.*;
import java.util.*;
import DataTransferObjects.*;

public class InvoiceTransaction implements InvoiceTransDAO {

	@Override
	public Collection<InvoiceTransDTO> findByInvoice(int id) {
		try {
			Connection connection  = DBUtility.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from invoice_trans where invoiceno=? ;");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			List<InvoiceTransDTO> transactions = new ArrayList<>();
			while(rs.next()) {
				InvoiceTransDTO transaction = new InvoiceTransDTO();
				transaction.setInvoiceNumber(rs.getInt("invoiceno"));
				transaction.setItemNumber(rs.getInt("itemno"));
				transaction.setItemQuantity(rs.getInt("itemqty"));
				transactions.add(transaction);	
			}
			return transactions;		
			
		} catch (Exception e) {
			DBUtility.closeConnection(e);
		}	
		return null;
	}
	@Override
	public int updateTransaction(InvoiceTransDTO transaction) {
		try {
			Connection connection  = DBUtility.getConnection();
			int invoiceno= transaction.getInvoiceNumber();
			int itemno = transaction.getItemNumber();	
			PreparedStatement statement =connection.prepareStatement("select * from  invoice_trans where invoiceno = ? and itemno = ?;");
			statement.setInt(1, invoiceno);
			statement.setInt(2, itemno);
			ResultSet rs = statement.executeQuery();		
			if(rs.next()) {
				statement = connection.prepareStatement("update invoice_trans set itemqty = ?  where invoiceno=? and itemno = ?");
				statement.setInt(1, transaction.getItemQuantity());
				statement.setInt(2, transaction.getInvoiceNumber());
				statement.setInt(3, transaction.getItemNumber());	
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
	public int deleteTransaction(int invoiceId) {
		
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from  invoice_trans where invoiceno=?;");
			ps.setInt(1, invoiceId);
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
