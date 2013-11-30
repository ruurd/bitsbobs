//------------------------------------------------------------------------------
// Copyright (c) 2013 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import static org.junit.Assert.assertEquals;

/**
 * Step definitions for the Selenium InnerHTML test
 */
public class SeleniumInnerHTMLStepdefs {

    private WebDriver driver = null;
    private WebElement element = null;

    @Given("^I have opened the Google homepage$")
    public void openGoogleHomepage() {
        driver = new FirefoxDriver(new FirefoxProfile());
        driver.get("http://www.google.nl/");
    }

    @When("^I select the (.+) button$")
    public void selectGuessButton(String id) {
        element = driver.findElement(By.id(id));
    }

    @Then("^the inner HTML is (.+)$")
    public void checkInnerHTMLOfElement(String theHtml) {
        assertEquals("not the same", theHtml, element.getText());
    }
}
