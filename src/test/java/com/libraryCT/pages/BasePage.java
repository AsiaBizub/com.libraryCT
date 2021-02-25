package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver = Driver.getDriver();


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void logOut (){ //Work In Progress

        BrowserUtils.sleep(3);
        //BrowserUtils.
    }

    @FindBy(id="user_count")
    public WebElement userCount;

}

