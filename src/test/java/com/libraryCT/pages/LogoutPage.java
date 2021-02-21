package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage { // Work in Progress

    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id= "navbarDropdown")
    public WebElement navBarDropdown;

    @FindBy(className="dropdown-item")
    public WebElement dropDownItem;



}



