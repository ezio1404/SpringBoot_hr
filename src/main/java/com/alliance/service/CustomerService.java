package com.alliance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alliance.constants.StringConstants;
import com.alliance.entity.Customer;
import com.alliance.model.CustomerSearchFilter;
import com.alliance.model.ListResult;
import com.alliance.repository.CustomerRepository;

@Service("customerService")
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getCustomerList(Customer searchFilter) {
		List<Customer> customerList = customerRepository.listCustomers(searchFilter);
		return customerList;
	}

	public ListResult getCustomerListResult(CustomerSearchFilter searchFilter) {
		// List<Customer> customerList = customerRepository.listCustomers(searchFilter);
		List<Customer> customerGeneric = (List<Customer>) customerRepository.searchTable(Customer.class, "customer", searchFilter, StringConstants.customerSearchParameters, StringConstants.customerSearchParametersMap);
		Long customerListCount = customerRepository.getResultCount("customer", searchFilter, StringConstants.customerSearchParameters, StringConstants.customerSearchParametersMap);
		for (Customer customer : customerGeneric)
			System.out.println("CUSTOMER - " + customer.toString());
		return new ListResult(customerGeneric, customerListCount);
	}

	public boolean insertCustomer(Customer customer) {
		Customer insertedCustomer = customerRepository.saveAndFlush(customer);
		if (insertedCustomer != null) {
			return true;
		}
		return false;
	}

	public Customer getCustomerById(Integer customerId) {
		return customerRepository.findOneById(customerId);
	}
	public Customer updateCustomerInfo(Customer customer) {
		Customer fromDBCustomer = customerRepository.findOneById(customer.getId());
		fromDBCustomer.setInfo(customer);
		return customerRepository.saveAndFlush(fromDBCustomer);
	}

}
