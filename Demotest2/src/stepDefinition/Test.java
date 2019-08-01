package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class Test {
	@Given("^I launch \"([^\"]*)\" page$")
	public void i_launch_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I launch page" +arg1);
	   // throw new PendingException();
	}

	@When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I fill in with "+arg1+arg2);
	}

	@When("^I fill \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_with(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("I fill with "+arg1+arg2);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("I click on button"+arg1);
	}

	@Then("^I am on the \"([^\"]*)\" page$")
	public void i_am_on_the_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("I am on the page"+arg1);
	}


}
