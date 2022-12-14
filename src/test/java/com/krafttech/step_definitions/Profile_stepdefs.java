package com.krafttech.step_definitions;

import com.krafttech.pages.ProfilePage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Profile_stepdefs {
    ProfilePage profilePage=new ProfilePage();

    @When("User should go to My Profile")
    public void user_should_go_to_my_profile() {
        profilePage.myProfileBtn.click();
    }
    @When("User should navigate to {string}")
    public void user_should_navigate_to(String tabname) {
        profilePage.profileTabs(tabname);
    }
    @When("User should input the information boxes")
    public void user_should_input_the_information_boxes() {
        profilePage.fullName.sendKeys("Melek");
        profilePage.about.sendKeys("This is great work");
        profilePage.company.sendKeys("ArtıTech");

        BrowserUtils.waitForVisibility(profilePage.slider,5);
        BrowserUtils.dragAndDropBy(profilePage.slider,150,0);

        Select select=new Select(profilePage.job);
        select.selectByVisibleText("SDET");
        profilePage.website.sendKeys("krafttechnologie.com");
        profilePage.location.sendKeys("Ankara");
        profilePage.skills.sendKeys("Postman, Cucumber, Apı, SQL");
        BrowserUtils.clickWithJS(profilePage.save);

    }

    @Then("User should verify the profile updated massage")
    public void user_should_verify_the_profile_updated_massage() {
        String actual=profilePage.profileUpdatemsg.getText();
        String expected= "Profile Updated";

        Assert.assertEquals(expected,actual);
    }

    @Then("User should see the profile options")
    public void user_should_see_the_profile_options(List<String> profileOptions) {
        List<String>actualOptions=BrowserUtils.getElementsText(profilePage.profileOptions);
        System.out.println(actualOptions.size());
        System.out.println(actualOptions);
        System.out.println(profileOptions);

        Assert.assertEquals(profileOptions,actualOptions);
    }
}
