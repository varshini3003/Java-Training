package DataAccessObjects;

import java.util.Collection;

import DataTransferObjects.InvoiceMasterDTO;

public interface InvoiceMasterDAO {
	public InvoiceMasterDTO findById(int invoiceid);
	public InvoiceMasterDTO findByCustomer(int customer_id);
	public Collection<InvoiceMasterDTO> findAll();	
	public int updateInvoice(InvoiceMasterDTO invoice);
	public int deleteInvoice(int invoiceid);
}
