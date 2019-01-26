package com.alliance.entity;

import java.util.Collection;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.alliance.model.SearchFilter;

@Entity
@Table(name = "customer", schema = "tsc", catalog = "")
public class Customer extends SearchFilter {
	private int id;
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String email;
	private String contact;
	private String phone;
	private String phoneType;

	@Id
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "street", nullable = true, length = 128)
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Basic
	@Column(name = "city", nullable = true, length = 64)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Basic
	@Column(name = "state", nullable = true, length = 2)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Basic
	@Column(name = "zip", nullable = true, length = 6)
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Basic
	@Column(name = "country", nullable = true, length = 3)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Basic
	@Column(name = "email", nullable = false, length = 64)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Basic
	@Column(name = "contact", nullable = false, length = 32)
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Basic
	@Column(name = "phone", nullable = true, length = 32)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Basic
	@Column(name = "phone_type", nullable = true)
	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Customer customer = (Customer) o;
		return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(street, customer.street) && Objects.equals(city, customer.city) && Objects.equals(state, customer.state) && Objects.equals(zip, customer.zip) && Objects.equals(country, customer.country) && Objects.equals(email, customer.email) && Objects.equals(contact, customer.contact) && Objects.equals(phone, customer.phone) && Objects.equals(phoneType, customer.phoneType);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, name, street, city, state, zip, country, email, contact, phone, phoneType);
	}

	public void setInfo(Customer customer) {
		this.name = customer.getName();
		this.street = customer.getStreet();
		this.city = customer.getCity();
		this.state = customer.getState();
		this.zip = customer.getZip();
		this.country = customer.getCountry();
		this.email = customer.getEmail();
		this.contact = customer.getContact();
		this.phone = customer.getPhone();
		this.phoneType = customer.getPhoneType();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + ", email=" + email + ", contact=" + contact + ", phone=" + phone + ", phoneType=" + phoneType + ", pageSize=" + getPageSize() + ", page=" + getPage() + "]";
	}

}
