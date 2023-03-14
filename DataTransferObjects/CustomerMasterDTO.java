package DataTransferObjects;

import java.io.Serializable;

public class CustomerMasterDTO implements Comparable<CustomerMasterDTO> , Serializable{
	private int customer_id;
	private String customername, customeraddress;
	public CustomerMasterDTO(int customer_id, String customername, String customeraddress) {
		super();
		this.customer_id = customer_id;
		this.customername = customername;
		this.customeraddress = customeraddress;
	}
	public String toString() {
		return "Customer Details: [customer_id=" + customer_id + ", customer_name=" + customername + ", customer_address=" + customeraddress + "]";
	}
	public CustomerMasterDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return customer_id;
	}

	public void setId(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return customername;
	}

	public void setName(String customername) {
		this.customername = customername;
	}

	public String getAddress() {
		return customeraddress;
	}

	public void setAddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	@Override
	public int compareTo(CustomerMasterDTO o) {
		return 0;
	}	
	
}
