package com.naukarcms.cv.model;

public class EducationalHistory {
	private int monthFrom;
	private int yearFrom;
	private int monthTo;
	private int yearTo;
	
	private String fieldOfStudy;
	private String city;
	private String country;
	private String summary;
	public int getMonthFrom() {
		return monthFrom;
	}
	public void setMonthFrom(int monthFrom) {
		this.monthFrom = monthFrom;
	}
	public int getYearFrom() {
		return yearFrom;
	}
	public void setYearFrom(int yearFrom) {
		this.yearFrom = yearFrom;
	}
	public int getMonthTo() {
		return monthTo;
	}
	public void setMonthTo(int monthTo) {
		this.monthTo = monthTo;
	}
	public int getYearTo() {
		return yearTo;
	}
	public void setYearTo(int yearTo) {
		this.yearTo = yearTo;
	}
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
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
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}
