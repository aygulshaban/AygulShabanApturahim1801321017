package Models;

import Services.ReservationService;

public class ReservationModel {
	
	public String docFirstName;
	public String docLastName;
	public String patFirstName;
	public String patLastName;
	public String patPhone;
	public String date;
	private String message2;
	
	public void navigateToMe() {
		System.out.println("Моля, попълнете полетата за успешно запазване на час!");
	}
	
	public void setDocFirstName(String docFirstName) {
		this.docFirstName = docFirstName;
	}
	
	public void setDocLastName(String docLastName) {
		this.docLastName = docLastName;
	}

	public void setPatFirstName(String patFirstName) {
		this.patFirstName = patFirstName;
	}
	
	public void setPatLastName(String patLastName) {
		this.patLastName = patLastName;
	}
	
	public void setPatPhone(String patPhone) {
		this.patPhone = patPhone;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void clickNextButton() {
		message2 = ReservationService.reservation(docFirstName, docLastName, patFirstName, patLastName, patPhone, date);
	}
	
	public String getReservationMessage() {
		return message2;
	}

}
