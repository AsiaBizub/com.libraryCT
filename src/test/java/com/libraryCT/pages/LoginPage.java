package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "inputEmail")
    public WebElement usernameInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String userName, String userPassword){
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(userPassword);
        signInButton.click();

    }


}