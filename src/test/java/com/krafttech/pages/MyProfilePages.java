package com.krafttech.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.krafttechnologie.Utilities.BrowserUtils;
import com.krafttechnologie.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePages extends BasePage {
    WebDriver driver;

    @FindBy(xpath = "//button[.='Edit Profile'] ")
    public WebElement editBtn;

    @FindBy(css = "#name")
    public WebElement fullName;


    @FindBy(css = "#about")
    public WebElement about;

    @FindBy(xpath = "(//input[@id='company'])[1]")
    public WebElement company;

    @FindBy(css = "#terms")
    public WebElement slider;

    @FindBy(css = ".form-select")
    public WebElement job;

    @FindBy(xpath = "//input[@id='website']")
    public WebElement website;

    @FindBy(xpath = "(//input[@id='location'])[1]")
    public WebElement location;

    @FindBy(xpath = "//input[@id='skills']")
    public WebElement skills;

    @FindBy(xpath = "//button[.='Save Changes']")
    public WebElement save;


    @FindBy (xpath = "//div[@class='alert alert-success bg-success text-light border-0 alert-dismissible fade show']")
    public WebElement profileUpdate;

    @FindBy (xpath = "(//span[.='My Profile'])[2]")
    public WebElement myProfileButton;

    @FindBy(xpath = "//input[@placeholder='Job Title *']")
    public WebElement jobTitle;

    @FindBy(xpath = "//input[@placeholder='Company *']")
    public WebElement companyexperience;

    @FindBy(xpath = "//input[@placeholder='Location'] ")
    public WebElement locationExperience;

    @FindBy(xpath = "(//input[@placeholder='From Date'])[1]")
    public WebElement startYear;

    @FindBy(xpath = "(//input[@placeholder='To Date '])[1]")
    public WebElement endYear;

    @FindBy(xpath = "//textarea[@placeholder='Job Description']")
    public WebElement jobDescription;

    @FindBy(xpath = "//button[@value='experience']")
    public WebElement addExperienceBtn;

    @FindBy(xpath = "//input[@value='qaoguzbeyt@gmail.com']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement profilEmail_loc;




    public void navigateToModule(String module){
        driver=Driver.get();

        String moduleLocator="//button[.='"+module+"']";

        BrowserUtils.waitForClickablility(By.xpath(moduleLocator),5);
        WebElement moduleElement=Driver.get().findElement(By.xpath(moduleLocator));
        moduleElement.click();


    }
}
