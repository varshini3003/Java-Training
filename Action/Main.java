package Action;
import DataTransferObjects.*;
import DataAccessObjects.*;
public class Main {
	public static void main(String[] args) {
		CustomerMasterDAO customer = new Customer();	
		ItemMasterDAO item = new Items();
		InvoiceMasterDAO invoice  = new Invoice();	
		InvoiceTransDAO transaction = new InvoiceTransaction();
		InvoiceTransDTO demoTransaction = new InvoiceTransDTO(100, 1, 80);	
		System.out.println(transaction.updateTransaction(demoTransaction));
		System.out.println(invoice.deleteInvoice(102));
		System.out.println(item.findAll());
		System.out.println(customer.findByName("varshini"));
		System.out.println(item.findById(2));	
	}
}
