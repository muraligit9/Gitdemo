package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination 
{
	@Given("^User is on netbanking page$")
    public void user_is_on_netbanking_page()
	{
        System.out.println("User is on login page");
    }

    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2)
    {
       System.out.println(strArg1);
       System.out.println(strArg2);
       System.out.println(strArg1+"and"+strArg2);
    }

    @Then("^home page is populated$")
    public void home_page_is_populated()
    {
      System.out.println("home page is populated");
      System.out.println("homepage displayed with all required fields");
    }
 
    @And("^cards displayed is \"([^\"]*)\"$")
    public void cards_displayed_is_something(String strArg1)
    {
    	System.out.println(strArg1);
    }

}
