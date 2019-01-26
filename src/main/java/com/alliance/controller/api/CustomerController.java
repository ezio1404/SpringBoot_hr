package com.alliance.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alliance.entity.Customer;
import com.alliance.model.CustomerSearchFilter;
import com.alliance.model.ListResult;
import com.alliance.service.CustomerService;

@RestController(value = "customerApiController")
@RequestMapping(value = "/api/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	//
	// @RequestMapping(method = RequestMethod.GET)
	// public List<Customer> getCustomerList(Customer searchFilter) {
	// System.out.println("THIS IS CUSTOMER SEARCHF ILTER " + searchFilter.toString());
	// return customerService.getCustomerList(searchFilter);
	// }

	@RequestMapping(method = RequestMethod.GET)
	public ListResult getCustomerList(CustomerSearchFilter searchFilter) {
		System.out.println("THIS IS SERACH FILTER - " + searchFilter.toString());

		return customerService.getCustomerListResult(searchFilter);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Customer getCustomerById(@PathVariable(name = "id") Integer customerId) {
		return customerService.getCustomerById(customerId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{id}")
	public Customer updateCustomerInfo(@PathVariable(name = "id") Integer customerId, Customer customer) {
		System.out.println("CUSTOMER NAME = " + customer.getName());
		return customerService.updateCustomerInfo(customer);
	}

	@RequestMapping(method = RequestMethod.POST)
	public boolean addCustomers(Customer customer) {
		return customerService.insertCustomer(customer);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/info")
	public Customer getCustomerInfo() {
		return new Customer();
	}
}
