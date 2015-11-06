//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Basic steps
 */
public class StepdefsBase {

    protected WebDriver driver = null;

    public StepdefsBase() {
        driver = new PhantomJSDriver();
    }
}
