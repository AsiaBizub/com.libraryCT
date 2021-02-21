package com.libraryCT.step_definitions;

import com.libraryCT.pages.BasePage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinition {


    @Given("The user navigates to login page")
    public void the_user_navigates_to_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));

    }

    @When("The user enters {string} and {string}")
    public void the_user_enters_and(String email, String password) {
        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);
        loginPage.signInButton.click();

    }

    @Then("{string} on {string}")  // finish the if logic for librarian
    public void on(String role, String page) {
       if(role.contains("student")){
           String actualTitle = Driver.getDriver().getTitle();
           String expectedTitle = page + actualTitle;

           //Checking the context of the web element
           Assert.assertTrue(actualTitle.contains(expectedTitle));

       }
    }


}

