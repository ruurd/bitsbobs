//------------------------------------------------------------------------------
// Copyright (c) 2013 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * File comments here please!
 */
public class JavaObjectOrientationStepdefs {

    private String programmer;
    private String relation;
    private String drvdType;
    private String baseType;
    private String drvdPackage;
    private String basePackage;

    @Given("^I am a (.+) Java programmer$")
    public void programmer(String programmer) {
        this.programmer = programmer;
    }

    @When("^I want to know if (.+) (.+) (.+)$")
    public void leftIsIRight(String drvdType, String relation, String baseType) {
        this.relation = relation;
        this.drvdType = drvdType;
        this.baseType = baseType;

    }

    @And("^the base type is in (.+)$")
    public void baseClassInPackage(String basePackage) {
        this.basePackage = basePackage;
    }

    @And("^the derived type is in (.+)$")
    public void derivedClassInPackage(String drvdPackage) {
        this.drvdPackage = drvdPackage;
    }

    @Then("^I check if base type is a class$")
    public void isAClass() {
        try {
            Class.forName(basePackage + "." + baseType);
        } catch (ClassNotFoundException cnfx) {
            fail(cnfx.getMessage());
        }
    }

    @Then("^I check if base type is an interface$")
    public void isAnInterface() {
        try {
            Class.forName(basePackage + "." + baseType).isInterface();
        } catch (ClassNotFoundException cnfx) {
            fail(cnfx.getMessage());
        }
    }


    @Then("^I run a test to find out$")
    public void findOut() {
        try {
            Class<?> baseClzz = Class.forName(basePackage + "." + baseType);
            Class<?> drvdClzz = Class.forName(drvdPackage + "." + drvdType);

            assertTrue("hey, " + programmer +", " + drvdType + " is not " + relation + " " + baseType, baseClzz.isAssignableFrom(drvdClzz));
        }
        catch (ClassNotFoundException cnfx) {
            fail(cnfx.getMessage());
        }
    }

}
