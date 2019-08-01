package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class Test {
	@Given("^I have two numbers$")
	public void i_have_two_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I have two numbers");
	}

	@When("^I add \"([^\"]*)\" the numbers$")
	public void i_add_the_numbers(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I add the numbers "+arg1);
	}

	@Then("^numbers should be added$")
	public void numbers_should_be_added() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("numbers should be added ");
	}

	@Given("^there is third number$")
	public void there_is_third_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("There is third number ");
	}

	@Then("^check the result$")
	public void check_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Check the result ");
	}

}
