package com.bachir.section14.binding;

import java.util.LinkedHashMap;

public class Student {
		
	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public Student() {
		//Populate Country Options: Used Country ISO Code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("US", "United States Of America");
		countryOptions.put("NE", "Niger");
		countryOptions.put("CA", "Canada");
		countryOptions.put("FR", "France");
		
		
		favoriteLanguageOptions = new LinkedHashMap<>();
		
	    // parameter order: value, display label
	    favoriteLanguageOptions.put("Java", "Java");
	    favoriteLanguageOptions.put("C#", "C#");
	    favoriteLanguageOptions.put("PHP", "PHP");
	    favoriteLanguageOptions.put("Ruby", "Ruby"); 
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
}
