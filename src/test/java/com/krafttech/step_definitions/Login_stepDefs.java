package com.krafttech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepDefs {
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("\"batch2 was here\" = " + "batch2 was here");
        System.out.println("I open the browser and navigate the page");

    }

    @When("The user enters Mike credentials")
    public void the_user_enters_mike_credentials() {
        System.out.println("I enter  Mike username, password and click submit button");
    }


        @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
            System.out.println("I verify that URL change dashboard page");
        }


    @When("The user enters Sebastian credentials")
    public void theUserEntersSebastianCredentials() {
        System.out.println("I enter  Sebastian username, password and click submit button");

    }

    @When("The user enters Jhon Nash credentials")
    public void theUserEntersJhonNashCredentials() {
        System.out.println("I enter  Jhon Nash username, password and click submit button");

    }
}
