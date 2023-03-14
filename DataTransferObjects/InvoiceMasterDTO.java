package DataTransferObjects;

import java.io.Serializable;

public class InvoiceMasterDTO implements Comparable<CustomerMasterDTO> , Serializable{	
	private int invoiceno , customer_id;
	private String date;
	public InvoiceMasterDTO(int invoiceno, int customer_id, String date) {
		super();
		this.invoiceno = invoiceno;
		this.customer_id = customer_id;
		this.date = date;
	}
	public String toString() {
		return "Invoice Details [Invoice no=" + invoiceno + ", Customer id=" + customer_id + ", Date=" + date + "]";
	}
	
	public InvoiceMasterDTO() {
		super();
	}
	
	public int getInvoiceId() {
		return invoiceno;
	}
	
	public void setInvoiceId(int invoiceno) {
		this.invoiceno = invoiceno;
	}

	public int getCustomerId() {
		return customer_id;
	}

	public void setCustomerId(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int compareTo(CustomerMasterDTO o) {
		return 0;
	}

}
