package cucumber.exam.uni;

import static org.junit.Assert.assertEquals;

import Models.ReservationModel;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReservationSteps {
	
	ReservationModel resModel = new ReservationModel();
	
	@Given("^Пациентът вижда полета за попълване$")
	public void openReservationFields() throws Throwable {
	   resModel.navigateToMe();
	}

	@When("^Пациентът натисне бутона за напред$")
	public void clickNextButton() throws Throwable {
	    resModel.clickNextButton();
	}

	@When("^Пациентът избира дата \"([^\"]*)\"$")
	public void selectDate(String date) throws Throwable {
	    resModel.setDate(date);
	}

	@When("^пациентът натисне бутона за напред$")
	public void clickNextButton1() throws Throwable {
	  resModel.clickNextButton();
	}

	@When("^пациентът въвежда име на лекар \"([^\"]*)\"$")
	public void addDocFirstName(String docFirstName) throws Throwable {
	    resModel.setDocFirstName(docFirstName);
	}

	@When("^пациентът въвежда фамилия на лекар \"([^\"]*)\"$")
	public void addDoctorLastName(String docLastName) throws Throwable {
	    resModel.setDocLastName(docLastName);
	}

	@When("^пациентът избира дата \"([^\"]*)\"$")
	public void selectDate1(String date) throws Throwable {
	    resModel.setDate(date);
	}

	@When("^пациентът въвежда собствено име \"([^\"]*)\"$")
	public void addPatFirstName(String patFirstName) throws Throwable {
	   resModel.setPatFirstName(patFirstName);
	}

	@When("^пациентът въвежда собствена фамилия \"([^\"]*)\"$")
	public void addPatLastName(String patLastName) throws Throwable {
	    resModel.setPatLastName(patLastName);
	}

	@When("^пациентът въвежда собствен телефонен номер \"([^\"]*)\"$")
	public void addPatPhone(String patPhone) throws Throwable {
	    resModel.setPatPhone(patPhone);
	}
	

	@Then("^пациентът вижда съобщение \"([^\"]*)\"\\.$")
	public void checkReservationMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, resModel.getReservationMessage());
	}
	
	@Then("^Пациентът вижда съобщение \"([^\"]*)\"\\.$")
	public void checkReservationMessage1(String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, resModel.getReservationMessage());
	}


}
