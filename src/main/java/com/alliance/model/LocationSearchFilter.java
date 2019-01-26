package com.alliance.model;

import java.io.Serializable;

public class LocationSearchFilter extends SearchFilter implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private String alternatePhone;

	private String alternatePhoneType;

	private String city;

	private String country;

	private String email;

	private String fkCustomerId;

	private String manager;

	private String phone;

	private String phoneType;

	private String siteName;

	private String siteNumber;

	private String state;

	private String street;

	private String zip;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAlternatePhone() {
		return alternatePhone;
	}

	public void setAlternatePhone(String alternatePhone) {
		this.alternatePhone = alternatePhone;
	}

	public String getAlternatePhoneType() {
		return alternatePhoneType;
	}

	public void setAlternatePhoneType(String alternatePhoneType) {
		this.alternatePhoneType = alternatePhoneType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFkCustomerId() {
		return fkCustomerId;
	}

	public void setFkCustomerId(String fkCustomerId) {
		this.fkCustomerId = fkCustomerId;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSiteNumber() {
		return siteNumber;
	}

	public void setSiteNumber(String siteNumber) {
		this.siteNumber = siteNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "LocationSearchFilter [id=" + id + ", alternatePhone=" + alternatePhone + ", alternatePhoneType=" + alternatePhoneType + ", city=" + city + ", country=" + country + ", email=" + email + ", fkCustomerId=" + fkCustomerId + ", manager=" + manager + ", phone=" + phone + ", phoneType=" + phoneType + ", siteName=" + siteName + ", siteNumber=" + siteNumber + ", state=" + state + ", street=" + street + ", zip=" + zip + "]";
	}

}