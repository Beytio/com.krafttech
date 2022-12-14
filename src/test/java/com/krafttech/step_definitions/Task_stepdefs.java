package com.krafttech.step_definitions;

import com.krafttech.pages.ProfilePage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Task_stepdefs {

    ProfilePage profilePage=new ProfilePage();

    @Then("User should see the profile options and username")
    public void user_should_see_the_profile_options_and_username(List<String> profileOptionsUsername) {

        List<String>actualOptions= BrowserUtils.getElementsText(profilePage.profileOptionsandUsername);
        System.out.println(actualOptions.size());
        System.out.println(actualOptions);
        System.out.println(profileOptionsUsername);

        Assert.assertEquals(profileOptionsUsername,actualOptions);

    }

    @When("User should go to {string} module")
    public void user_should_go_to_module(String TabName) {
        profilePage.profileTabs(TabName);


    }
    @When("User should input information and click Add Experience button")
    public void user_should_input_information_and_click_add_experience_button() {
        profilePage.jobTitle.sendKeys("QA Engineer");
        profilePage.companyexperience.sendKeys("Amazon");
        profilePage.locationExperience.sendKeys("New York");
        profilePage.startYear.sendKeys("10.05.2022");
        profilePage.endYear.sendKeys("03.02.2023");
        profilePage.jobDescription.sendKeys("Test NG, Cucumber, Selenium");
        profilePage.addExperienceBtn.click();
        BrowserUtils.waitFor(3);

    }

    @Then("User should see Overview module")
    public void user_should_see_overview_module() {
        String expectedTitle="Profile Details";
        String actualTitle=profilePage.profileDetails.getText();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
