package DataAccessObjects;
import DataTransferObjects.*;
import java.sql.*;
import java.util.*;

public class Invoice implements InvoiceMasterDAO{
	public InvoiceMasterDTO findById(int id) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from invoice_master where invoiceno =?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				InvoiceMasterDTO invoice = new InvoiceMasterDTO();
				invoice.setInvoiceId(id);
				invoice.setDate(rs.getString("date"));
				invoice.setCustomerId(rs.getInt("customerid"));
				
				return invoice;
			}

		} catch (Exception e) {
			DBUtility.closeConnection(e);
		}
		return null;
	}
	public InvoiceMasterDTO findByCustomer(int id) {
		try {
			Connection connection  = DBUtility.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from invoice_master where customer_id =?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				InvoiceMasterDTO invoice = new InvoiceMasterDTO();
				invoice.setCustomerId(id);
				invoice.setDate(rs.getString("date"));
				invoice.setInvoiceId(rs.getInt("invoiceNumber"));
				
				return invoice;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
		}
		return null;
	}
	public Collection<InvoiceMasterDTO> findAll() {
		try {
			Connection connection  = DBUtility.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from invoice_master ;");
			ResultSet rs = statement.executeQuery();
			List<InvoiceMasterDTO> invoices = new ArrayList<>();
			while(rs.next()) {
				InvoiceMasterDTO invoice = new InvoiceMasterDTO();
				invoice.setInvoiceId(rs.getInt("invoicenumber"));
				invoice.setDate(rs.getString("date"));
				invoice.setCustomerId(rs.getInt("customerid"));
				invoices.add(invoice);
			}
			return invoices;
		} catch (Exception e) {
			DBUtility.closeConnection(e);
		}	
		return null;
	}
	@Override
	public int updateInvoice(InvoiceMasterDTO invoice) {
		try {
			Connection connection  = DBUtility.getConnection();
			int id= invoice.getInvoiceId();
			PreparedStatement statement =connection.prepareStatement("select * from invoice_master where invoiceno = ?;");
			statement.setInt(1, id);		
			ResultSet rs = statement.executeQuery();
			if(rs.next()) {
				statement = connection.prepareStatement("update invoice_master set date = ? , customer_id = ? where invoiceno =? ");
				statement.setString(1, invoice.getDate());
				statement.setInt(2, invoice.getCustomerId());
				statement.setInt(3, invoice.getInvoiceId());
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
	public int deleteInvoice(int id) {
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from invoice_master where invoiceno=?;");
			ps.setInt(1, id);
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
