//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Step definitions for the Googling feature
 */
public class GooglingStepdefs extends StepdefsBase {

    private WebElement element = null;
    private WebElement input = null;

    @After
    public void after() {
        driver.close();
        driver.quit();
    }

    @Given("^I have opened the Google homepage$")
    public void openGoogleHomepage() {
        driver.get("http://www.google.nl/");
    }

    @When("^I select the (.+) button$")
    public void selectGuessButton(String id) {
        element = driver.findElement(By.id(id));
    }

    @When("^I select the input with name of (.+)$")
    public void selectInputWithName(String name) throws Throwable {
        input = driver.findElement(By.name(name));
    }

    @And("^I enter (.+)$")
    public void enter(String value) throws Throwable {
        input.sendKeys(value);
        input.sendKeys(Keys.TAB);
    }

    @And("^I press (.+)$")
    public void press(String keyname) throws Throwable {
        input.sendKeys(Keys.valueOf(keyname.toUpperCase()));
    }

    @Then("^a result page opens$")
    public void aResultPageOpens() throws Throwable {
        new WebDriverWait(driver, 10).until(
            new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return driver.findElement(By.id("resultStats")).isDisplayed();
                }
            }
        );
    }

    @Then("^the number of results is shown$")
    public void theNumberOfResultsIsShown() throws Throwable {
        element = driver.findElement(By.id("resultStats"));
        System.out.println(element.getText());
    }
}
