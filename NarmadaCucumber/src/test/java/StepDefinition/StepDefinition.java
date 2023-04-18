package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("Cucumber");
	}

	@And("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cucumber1");
	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cucumber2");
	}

}
