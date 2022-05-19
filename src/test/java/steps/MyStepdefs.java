package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {
    @Given("user navigate to url")
    public void userNavigateToUrl() {
        System.out.println("User in URl");
    }

    @Then("user print valid output")
    public void userPrintValidOutput() {
        System.out.println("User in valid creditions");

        System.out.println("Git Changes");
    }

    @Then("user print Invalid output")
    public void userPrintInvalidOutput() {
        System.out.println("User in INvalid creditions");
    }
}
