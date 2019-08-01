package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class Test {
	@Given("^I am not logged in as an administrator$")
	public void i_am_not_logged_in_as_an_administrator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("i am logging in as adminstrator");
	}

	@When("^I go to the adminstrative page$")
	public void i_go_to_the_adminstrative_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("i go to the adminstration page");
	}

	@When("^I fill in the fields$")
	public void i_fill_in_the_fields(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println(arg1.raw());
	    //throw new PendingException();
	}

	@When("^I press \"([^\"]*)\"$")
	public void i_press(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I am pressing"+arg1);
	}

	@Then("^I should be on the adminstrative page$")
	public void i_should_be_on_the_adminstrative_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I should be on the adminstrative page");
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("i should see"+arg1);
	}


}
