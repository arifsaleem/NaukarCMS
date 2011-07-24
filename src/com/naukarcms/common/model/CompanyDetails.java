package com.naukarcms.common.model;

/**
 * This object models the common details related to a company.
 * @author Arif Saleem
 *
 */
public class CompanyDetails {

	private String name;
	private String industry;
	private String city;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
