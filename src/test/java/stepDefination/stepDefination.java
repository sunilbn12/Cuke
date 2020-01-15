package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.*;

public class stepDefination {

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("user_is_on_landing_page");
	}

	@When("^User login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_with_username_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {

		System.out.println(strArg1);

		System.out.println(strArg2);
	}

	@Then("^Homepage is populated$")
	public void homepage_is_populated() throws Throwable {
		System.out.println("homepage_is_populated");
	}

	@And("^Cards Displayed \"([^\"]*)\"$")
	public void cards_displayed_something(String strArg1) throws Throwable {

		if (strArg1.equalsIgnoreCase("true")) {
			System.out.println("true is displayed");

		} else {

			System.out.println("false is displayed");

		}
	}

}
