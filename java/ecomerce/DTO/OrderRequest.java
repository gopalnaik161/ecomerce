package ecomerce.DTO;

import ecomerce.entity.Customer;

public class OrderRequest {
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}
	
}
