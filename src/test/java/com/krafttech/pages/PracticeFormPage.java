package com.krafttech.pages;

import com.krafttechnologie.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage {
    public PracticeFormPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy (id="firstName")
    public WebElement firstName;

    @FindBy (id="lastName")
    public WebElement lastName;

    @FindBy (id="userEmail")
    public WebElement userEmail;

    @FindBy (xpath="//label[.='Male']")
    public WebElement gender;


    @FindBy (id="userNumber")
    public WebElement userNumber;

    @FindBy (id="subjectsContainer")
    public WebElement Subjects;

    @FindBy (xpath="//label[.='Reading']")
    public WebElement hobbies;

    @FindBy (id="uploadPicture")
    public WebElement chooseFile;

    @FindBy (id="currentAddress")
    public WebElement currentAddress;

    @FindBy (xpath="(//div[@class=' css-1hwfws3'])[1]")
    public WebElement SelectState;

    @FindBy (xpath="(//div[@class=' css-1wy0on6'])[2]")
    public WebElement SelectCity;


    @FindBy (id="submit")
    public WebElement submit;





}
