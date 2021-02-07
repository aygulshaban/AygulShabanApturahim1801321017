package Models;

import Services.SearchService;

public class SearchModel {
	
	public String docFirstName;
	public String docLastName;
	public String specialization;
	private String message;
	
	public void navigateToMe() {
		System.out.println("Полетата за търсене са активни.");
	}
	
	public void setDocFirstName(String docFirstName) {
		this.docFirstName = docFirstName;
	}
	
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public void setDocLastName(String docLastName) {
		this.docLastName = docLastName;
	}
	
	public void clickSearchButton() {
		message = SearchService.search(docFirstName, docLastName, specialization);
	}
	
	public String getSearchMessage() {
		return message;
	}
}
