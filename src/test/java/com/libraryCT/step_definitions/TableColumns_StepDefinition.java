package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.TableColumnSearchPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;


import java.util.List;

public class TableColumns_StepDefinition {

    @Given("User-student98 should be already logged in")
    public void user_student98_should_be_already_logged_in() {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("stu98_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("stu98_pass"));
        loginPage.signInButton.click();
    }


    @Given("User-student99 should be already logged in")
    public void user_student99_should_be_already_logged_in() {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("stu99_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("stu99_pass"));
        loginPage.signInButton.click();

    }

    @Given("User-student100 should be already logged in")
    public void user_student100_should_be_already_logged_in() {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("stu100_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("stu100_pass"));
        loginPage.signInButton.click();

    }

    @Given("User-librarian15 should be already logged in")
    public void user_librarian15_should_be_already_logged_in() {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("lib15_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("lib15_pass"));
        loginPage.signInButton.click();

    }


    @Then("User should see the following column names")
    public void user_should_see_the_following_column_names(List <String> expectedColumnNames){
        TableColumnSearchPage tableColumnSearchPage = new TableColumnSearchPage();
        System.out.println("columnNames = " + expectedColumnNames);

        for (WebElement eachColumnName: tableColumnSearchPage.tableColumns) {
            System.out.println("eachColumnName = " + eachColumnName.getText());

        }

    }

}
