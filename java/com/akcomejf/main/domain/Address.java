package com.akcomejf.main.domain;

import com.akcomejf.main.common.BaseEntity;

public class Address extends BaseEntity {
	
	private Integer id;

	private String street;

	private String city;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
