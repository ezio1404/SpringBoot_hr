package com.alliance.repository.custom;

import java.util.List;

import com.alliance.entity.Customer;

public interface CustomerRepositoryCustom extends GenericRepositoryCustom {

	public List<Customer> listCustomers(Customer searchFilter);

	public Long countCustomers(Customer searchFilter);
}
