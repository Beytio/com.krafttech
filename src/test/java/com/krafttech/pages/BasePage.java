package com.krafttech.pages;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    // buradan abstract class olduğu için nesne oluşturamayız.
    // extend ederek diğer classlarda kullanabiliriz
    WebDriver driver;

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    public void navigateToModule(String tab, String module){

        String tabLocator= "//li[@class='nav-item']//span[.='"+tab+"']";  ////li[@class='nav-item']//span[.='Components']

        String moduleLocator="//span[.='"+module+"']";

        driver = Driver.get();

        BrowserUtils.waitForClickablility(By.xpath(tabLocator),5);
        WebElement tabElement=driver.findElement(By.xpath(tabLocator));
        tabElement.click();


        BrowserUtils.waitForClickablility(By.xpath(moduleLocator),5);
        driver.findElement(By.xpath(moduleLocator)).click();



    }


    public String  subTitle(String subTitle){

        String subTitleLocator="//h1[.='"+subTitle+"']";
        BrowserUtils.waitForPresenceOfElement(By.xpath(subTitleLocator),5);

        WebElement Subtitle=Driver.get().findElement(By.xpath(subTitleLocator));

        String actualSubtitle= Subtitle.getText();

        return actualSubtitle;


    }

    public void name(){
        int yaş=35;
        String name="Ahmet Koçak "+yaş+" yaşındadır";
        System.out.println("name = " + name);


    }


}
