package DataTransferObjects;

import java.io.Serializable;

public class InvoiceTransDTO implements Comparable<InvoiceTransDTO> , Serializable{
	private int invoiceno , itemno , itemqty;
	public InvoiceTransDTO() {
		super();
	}

	public InvoiceTransDTO(int invoiceno, int itemno, int itemqty) {
		super();
		this.invoiceno = invoiceno;
		this.itemno = itemno;
		this.itemqty = itemqty;
	}

	public int getInvoiceNumber() {
		return invoiceno;
	}

	public void setInvoiceNumber(int invoiceno) {
		this.invoiceno = invoiceno;
	}

	public int getItemNumber() {
		return itemno;
	}

	public void setItemNumber(int itemno) {
		this.itemno = itemno;
	}

	public int getItemQuantity() {
		return itemqty;
	}

	public void setItemQuantity(int itemqty) {
		this.itemqty = itemqty;
	}

	@Override
	public int compareTo(InvoiceTransDTO o) {
		return 0;
	}
	
}
