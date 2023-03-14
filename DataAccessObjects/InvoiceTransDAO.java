package DataAccessObjects;

import java.util.Collection;

import DataTransferObjects.InvoiceTransDTO;

public interface InvoiceTransDAO {
	public Collection<InvoiceTransDTO> findByInvoice(int invoiceid);
	public int updateTransaction(InvoiceTransDTO transaction);
	public int deleteTransaction(int invoiceid);
}
