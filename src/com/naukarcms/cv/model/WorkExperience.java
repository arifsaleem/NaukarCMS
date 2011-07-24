package com.naukarcms.cv.model;

import java.util.ArrayList;

import com.naukarcms.common.model.CompanyDetails;
import com.naukarcms.common.model.Responsiblity;

/**
 * This object reflects a simple work-experience object that can be added to a CV object.
 * @author Arif Saleem
 *
 */
public class WorkExperience {

	private int monthFrom;
	private int yearFrom;
	private int monthTo;
	private int yearTo;
	
	private String jobTitle;
	private CompanyDetails companyDetails;
	
	private String breifDescription;
	private ArrayList<Responsiblity> responsibilities;
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
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}
	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}
	public String getBreifDescription() {
		return breifDescription;
	}
	public void setBreifDescription(String breifDescription) {
		this.breifDescription = breifDescription;
	}
	public ArrayList<Responsiblity> getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(ArrayList<Responsiblity> responsibilities) {
		this.responsibilities = responsibilities;
	}	
}
