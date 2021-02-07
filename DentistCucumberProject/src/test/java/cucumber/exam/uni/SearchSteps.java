package cucumber.exam.uni;

	import static org.junit.Assert.assertEquals;

	import Models.SearchModel;
	import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class SearchSteps {
		
		SearchModel searchModel = new SearchModel();
		
		@Given("^пациента има полета за търсене\\.$")
		public void openSearchFields() throws Throwable {
		   searchModel.navigateToMe();
		}

		@When("^пациента въвежда име \"([^\"]*)\"$")
		public void addFirstName(String docFirstName) throws Throwable {
		    searchModel.setDocFirstName(docFirstName);
		}

		@When("^пациента въвежда специализация \"([^\"]*)\"$")
		public void addSpecialization(String specialization) throws Throwable {
		   searchModel.setSpecialization(specialization);
		}

		@When("^пациента въвежда  фамилия \"([^\"]*)\"$")
		public void addLastName(String docLastName) throws Throwable {
		   searchModel.setDocLastName(docLastName);
		}
		
		@When("^пациента натисне бутона за търсене\\.$")
		public void clickSearchButton() throws Throwable {
		   searchModel.clickSearchButton();
		}
		
		@Then("^пациента вижда съобщение \"([^\"]*)\"\\.$")
		public void checkSearchMessage(String expectedMessage) throws Throwable {
		  assertEquals(expectedMessage, searchModel.getSearchMessage());
		}

}
