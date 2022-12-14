package com.krafttech.step_definitions;

import com.krafttech.pages.DashboardPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Dashboard_stepDefs {

    DashboardPage dashboardPage=new DashboardPage();

    @Then("User name should be {string}")
    public void user_name_should_be(String expectedName) {
        String actualName=dashboardPage.getUserName();
        System.out.println(actualName);
        System.out.println(expectedName);
        Assert.assertEquals("Verify that name is matching",expectedName,actualName);


    }

    @When("The user navigates to {string} menu")
    public void the_user_navigates_to_menu(String tabName) {
        dashboardPage.naviagateToTab(tabName);
    }
    @Then("The user should be able to see home name as {string}")
    public void the_user_should_be_able_to_see_home_name_as(String expectedhomeName) {
        BrowserUtils.waitFor(3);
        String actualhomeName= dashboardPage.getHomeName(expectedhomeName);
        Assert.assertEquals(expectedhomeName,actualhomeName);

    }





//    @Then("User should be able to see home name as {string}")
//    public void userShouldBeAbleToSeeHomeNameAs(String menuName) {
//        String expectedName = menuName;
//        String actualName= dashboardPage.getmenuName(menu);
//        Assert.assertEquals(expectedName,actualName);
//
//
//    }
}
