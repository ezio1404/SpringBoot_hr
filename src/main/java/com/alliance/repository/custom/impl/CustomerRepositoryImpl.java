package com.alliance.repository.custom.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.type.LongType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alliance.entity.Customer;
import com.alliance.repository.custom.CustomerRepositoryCustom;
import com.alliance.utility.StringUtility;

@Repository("customerRepositoryCustom")
@Transactional(readOnly = true)
public class CustomerRepositoryImpl extends GenericRepositoryImpl implements CustomerRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Customer> listCustomers(Customer searchFilter) {
		StringBuilder sqlQuery = new StringBuilder("SELECT  * FROM customer customer ");
		boolean appended = false;
		if (!StringUtility.isStringNullOrEmpty(searchFilter.getCity())) {
			sqlQuery.append(" WHERE customer.city LIKE :city ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getContact())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.contact LIKE :contact ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getCountry())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.country LIKE :country ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getEmail())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.email LIKE :email ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getName())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.name LIKE :name ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getPhone())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.phone LIKE :phone ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getPhoneType())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.phoneType LIKE :phoneType ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getState())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.state LIKE :state ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getStreet())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.street LIKE :street ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getZip())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.zip LIKE :zip");
			appended = true;
		}

		Query query = entityManager.createNativeQuery(sqlQuery.toString(), Customer.class);

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getCity())) {
			query.setParameter("city", "%" + searchFilter.getCity() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getContact())) {
			query.setParameter("contact", "%" + searchFilter.getContact() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getCountry())) {
			query.setParameter("country", "%" + searchFilter.getCountry() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getEmail())) {
			query.setParameter("email", "%" + searchFilter.getEmail() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getName())) {
			query.setParameter("name", "%" + searchFilter.getName() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getPhone())) {
			query.setParameter("phone", "%" + searchFilter.getPhone() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getPhoneType())) {
			query.setParameter("phoneType", "%" + searchFilter.getPhoneType() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getState())) {
			query.setParameter("state", "%" + searchFilter.getState() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getStreet())) {
			query.setParameter("street", "%" + searchFilter.getStreet() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getZip())) {
			query.setParameter("zip", "%" + searchFilter.getZip() + "%");
		}
		int firstResult = 0;
		// int pageSize = 15;
		// if (searchFilter.getPageSize() > 0) {
		// pageSize = searchFilter.getPageSize();
		// }
		// if (searchFilter.getPage() > 0) {
		// firstResult = pageSize * searchFilter.getPage();
		// }
		// query.setFirstResult(firstResult);
		// query.setMaxResults(pageSize);

		return query.getResultList();
	}

	@Override
	public Long countCustomers(Customer searchFilter) {
		StringBuilder sqlQuery = new StringBuilder("SELECT  count(*) AS customerCount FROM customer customer ");
		boolean appended = false;
		if (!StringUtility.isStringNullOrEmpty(searchFilter.getCity())) {
			sqlQuery.append(" WHERE customer.city LIKE :city ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getContact())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.contact LIKE :contact ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getCountry())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.country LIKE :country ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getEmail())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.email LIKE :email ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getName())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.name LIKE :name ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getPhone())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.phone LIKE :phone ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getPhoneType())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.phoneType LIKE :phoneType ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getState())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.state LIKE :state ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getStreet())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.street LIKE :street ");
			appended = true;
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getZip())) {
			if (appended)
				sqlQuery.append(" AND ");
			else
				sqlQuery.append(" WHERE ");
			sqlQuery.append(" customer.zip LIKE :zip");
			appended = true;
		}

		Query query = entityManager.createNativeQuery(sqlQuery.toString());

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getCity())) {
			query.setParameter("city", "%" + searchFilter.getCity() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getContact())) {
			query.setParameter("contact", "%" + searchFilter.getContact() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getCountry())) {
			query.setParameter("country", "%" + searchFilter.getCountry() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getEmail())) {
			query.setParameter("email", "%" + searchFilter.getEmail() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getName())) {
			query.setParameter("name", "%" + searchFilter.getName() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getPhone())) {
			query.setParameter("phone", "%" + searchFilter.getPhone() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getPhoneType())) {
			query.setParameter("phoneType", "%" + searchFilter.getPhoneType() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getState())) {
			query.setParameter("state", "%" + searchFilter.getState() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getStreet())) {
			query.setParameter("street", "%" + searchFilter.getStreet() + "%");
		}

		if (!StringUtility.isStringNullOrEmpty(searchFilter.getZip())) {
			query.setParameter("zip", "%" + searchFilter.getZip() + "%");
		}
		query.unwrap(SQLQuery.class).addScalar("customerCount", LongType.INSTANCE);

		return (Long) query.getSingleResult();
	}
}
